package com.demo.service;

import com.demo.dao.TickerDao;
import com.demo.model.OkxTickers;
import com.demo.model.TickerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

@Service
public class OkxService {
    @Value("${spring.proxy.http}")
    private String PROXYHOST;

    @Value("${spring.proxy.port}")
    private int PROXYPORT;

    @Autowired
    private TickerDao tickerDao;

    private final RestTemplate restTemplate = new RestTemplate();
    public OkxTickers getOkxTickers() {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(PROXYHOST, PROXYPORT));
        requestFactory.setProxy(proxy);
        restTemplate.setRequestFactory(requestFactory);
        MultiValueMap map = new HttpHeaders();
        map.set("User-Agent", "Mozilla/5.0");
        HttpEntity<String> entity = new HttpEntity<String>(map);
        String url = "https://www.okx.com/api/v5/market/tickers?instType=SPOT";
        ResponseEntity<OkxTickers> exchange = restTemplate.exchange(url, HttpMethod.GET, entity, OkxTickers.class);
        OkxTickers body = exchange.getBody();
        return body;
    }

    public void saveOkxTickers() {
        OkxTickers okxTickers = getOkxTickers();
        List<OkxTickers.DataDTO> data = okxTickers.getData();
        for (int i = 0; i < data.size(); i++) {
            OkxTickers.DataDTO dataDTO = data.get(i);
            if (dataDTO.getInstId().endsWith("-USD")) {
                tickerDao.insert(dataDTO);
            }
        }
    }

    public List<TickerVo> selectByInstId(TickerVo instId){
        return tickerDao.selectByInstId(instId);
    }
}
