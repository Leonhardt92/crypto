package com.demo.dao;

import com.demo.model.OkxTickers;
import com.demo.model.TickerVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TickerDaoTest {
    @Autowired
    private TickerDao tickerDao;
    @Test
    void insert() {
    }
    @Test
    void selectByInstId() {
        List<TickerVo> dataDTOList = tickerDao.selectByInstId(null);
        System.out.println(dataDTOList);
    }
}