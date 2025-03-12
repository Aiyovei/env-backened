package com.env.envbackend.controller;

import com.env.envbackend.service.Impl.HeatServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/heat")
public class HeatController {

    @Autowired
    private HeatServiceImpl heatService;

    /**
     * 获取每天的热耗碳排放强度
     * @return Map<Date, BigDecimal> key: 日期, value: 当天的热耗碳排放强度
     */
    @GetMapping("/daily-intensity")
    public Map<Date, BigDecimal> getDailyHeatCarbonIntensity() {
        return heatService.calculateDailyHeatCarbonIntensity();
    }


}
