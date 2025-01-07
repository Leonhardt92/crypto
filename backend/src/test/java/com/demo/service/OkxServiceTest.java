package com.demo.service;

import com.demo.dao.DemoDao;
import com.demo.model.OkxTickers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OkxServiceTest {
    @Autowired
    private OkxService okxService;
    @Test
    void getOkxTickers() {
        OkxTickers okxTickers = okxService.getOkxTickers();
        // 判断 okxTickers.getData() 的大小是否大于 0
        assertTrue(okxTickers.getData() != null && okxTickers.getData().size() > 0,
                "Data size should be greater than 0");
    }

    @Test
    void saveOkxTickers() {
        okxService.saveOkxTickers();
    }
}