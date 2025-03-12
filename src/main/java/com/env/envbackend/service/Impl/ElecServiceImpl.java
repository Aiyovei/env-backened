package com.env.envbackend.service.Impl;


import com.env.envbackend.mapper.ElecMapper;
import com.env.envbackend.mapper.WaterVolumeMapper;
import com.env.envbackend.pojo.ElecInfo;
import com.env.envbackend.pojo.WaterVolume;
import com.env.envbackend.service.ElecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ElecServiceImpl implements ElecService {

    @Autowired
    private ElecMapper elecMapper;

    @Autowired
    private WaterVolumeMapper waterVolumeMapper;

    @Override
    public Map<Date, BigDecimal> calculateDailyCarbonIntensity() {
        List<ElecInfo> elecInfoList = elecMapper.selectList(null);
        List<WaterVolume> waterVolumeList = waterVolumeMapper.selectList(null);

        Map<Date, Integer> waterFlowMap = waterVolumeList.stream()
                .collect(Collectors.toMap(WaterVolume::getObservationDate, WaterVolume::getInfluentWaterFlow, (a, b) -> b));

        Map<Date, BigDecimal> result = new HashMap<>();

        for (ElecInfo elec : elecInfoList) {
            Date date = elec.getObservationDate();
            Integer influentWaterFlow = waterFlowMap.getOrDefault(date, 0);

            if (influentWaterFlow == 0) {
                result.put(date, BigDecimal.ZERO);
                continue;
            }

            BigDecimal dailyIntensity = elec.getElectricityCarbonEmissionFactor()
                    .multiply(new BigDecimal(elec.getWastewaterPlantElectricityConsumption()))
                    .divide(new BigDecimal(influentWaterFlow), 4, BigDecimal.ROUND_HALF_UP);

            result.put(date, dailyIntensity);
        }
        return result;
    }

    @Override
    public BigDecimal calculateTotalElectricCarbonEmission() {
        return calculateDailyCarbonIntensity().values().stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
