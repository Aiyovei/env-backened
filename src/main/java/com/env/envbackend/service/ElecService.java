package com.env.envbackend.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * 电耗 Service 接口
 */
public interface ElecService {
    /**
     * 计算每天的电耗碳排放强度
     * @return Map<Date, BigDecimal> key: 日期, value: 当天电耗碳排放强度
     */
    Map<Date, BigDecimal> calculateDailyCarbonIntensity();

    /**
     * 计算电耗总碳排放量
     * @return BigDecimal 总电耗碳排放量
     */
    BigDecimal calculateTotalElectricCarbonEmission();
}
