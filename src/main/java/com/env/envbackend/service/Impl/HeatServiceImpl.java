package com.env.envbackend.service.Impl;

import com.env.envbackend.mapper.HeatInfoMapper;
import com.env.envbackend.mapper.WaterVolumeMapper;
import com.env.envbackend.pojo.HeatInfo;
import com.env.envbackend.pojo.WaterVolume;
import com.env.envbackend.service.HeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class HeatServiceImpl implements HeatService {

    @Autowired
    private HeatInfoMapper heatInfoMapper;

    @Autowired
    private WaterVolumeMapper waterVolumeMapper;




    /**
     * 计算每天的热耗碳排放强度
     * @return Map<Date, BigDecimal> key: 日期, value: 当天热耗碳排放强度
     */
    public Map<Date, BigDecimal> calculateDailyHeatCarbonIntensity() {
        // 获取所有热耗数据
        List<HeatInfo> heatInfoList = heatInfoMapper.selectList(null);
        // 获取所有水量数据
        List<WaterVolume> waterVolumeList = waterVolumeMapper.selectList(null);

        // 按日期组织水量数据
        Map<Date, Integer> waterFlowMap = waterVolumeList.stream()
                .collect(Collectors.toMap(WaterVolume::getObservationDate, WaterVolume::getInfluentWaterFlow, (a, b) -> b));

        // 结果存储
        Map<Date, BigDecimal> result = new HashMap<>();

        // 遍历热耗数据，计算每天的热耗碳排放强度
        for (HeatInfo heat : heatInfoList) {
            Date date = heat.getObservationDate();
            Integer influentWaterFlow = waterFlowMap.getOrDefault(date, 0);

            // 避免除零错误
            if (influentWaterFlow == 0) {
                result.put(date, BigDecimal.ZERO);
                continue;
            }

            // 计算 热耗碳排放强度 = (标准煤排放因子 * 外购标煤使用量) / 进水水量
            BigDecimal dailyIntensity = heat.getStandardCoalEmissionFactor()
                    .multiply(new BigDecimal(heat.getPurchasedStandardCoalUsage()))
                    .divide(new BigDecimal(influentWaterFlow), 4, BigDecimal.ROUND_HALF_UP);

            result.put(date, dailyIntensity);
        }

        return result;
    }


    /**
     * 计算热耗总碳排放量
     * @return BigDecimal 总热耗碳排放量
     */
    public BigDecimal calculateTotalHeatCarbonEmission() {
        Map<Date, BigDecimal> dailyHeatCarbon = calculateDailyHeatCarbonIntensity();
        return dailyHeatCarbon.values().stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }



}
