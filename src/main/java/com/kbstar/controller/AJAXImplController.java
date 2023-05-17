package com.kbstar.controller;

import com.kbstar.dto.Chart;
import com.kbstar.service.ChartService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AJAXImplController {

    @Autowired
    ChartService service;

    @RequestMapping("/gmtchart")
    public Object gmtchart() throws Exception {
        List<Chart> list = service.getMonthlyTotal();
        JSONArray data = new JSONArray();
        for(Chart c:list){
            data.add(c.getTotal());
        }
        return data;
        }
    }