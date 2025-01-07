package com.demo.scheduling;

import com.demo.service.OkxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class OkxScheduling {
    @Autowired
    private OkxService okxService;
    @Scheduled(fixedRate = 5000)
    public void saveTicker() {
        okxService.saveOkxTickers();
    }
}
