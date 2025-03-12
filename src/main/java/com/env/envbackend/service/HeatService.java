package com.env.envbackend.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * 热耗 Service 接口
 */
public interface HeatService {
    /**
     * 计算每天的热耗碳排放强度
     * @return Map<Date, BigDecimal> key: 日期, value: 当天热耗碳排放强度
     */
    Map<Date, BigDecimal> calculateDailyHeatCarbonIntensity();

    /**
     * 计算热耗总碳排放量
     * @return BigDecimal 总热耗碳排放量
     */
    BigDecimal calculateTotalHeatCarbonEmission();
}