package com.demo.controller;

import com.demo.model.OkxTickers;
import com.demo.model.TickerVo;
import com.demo.model.User;
import com.demo.service.OkxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin(origins = "*") // Allow requests from all origins
public class TickerController {
    @Autowired
    private OkxService okxService;

    @GetMapping(value = "/selectByName")
    public List<TickerVo>  selectByName(TickerVo id) {
        List<TickerVo> dataDTOList = okxService.selectByInstId(id);
        return dataDTOList;
    }
}
