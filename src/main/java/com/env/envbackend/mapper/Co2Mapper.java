package com.env.envbackend.mapper;

import com.env.envbackend.pojo.Co2Info;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Co2Mapper {

    /**
     * 插入一条CO2信息记录
     *
     * @param co2Info 包含要插入的数据的实体对象
     * @return 影响的行数
     */
    @Insert("INSERT INTO CO2_INFO " +
            "(CO2_Id, Observation_Date, Standard_Coal_Emission_Factor, " +
            "Daily_CO2_From_Standard_Coal_ConsumptionFossil_Fuel, Daily_CO2_From_Fossil_Fuel) " +
            "VALUES " +
            "(#{co2Info.co2Info}, #{co2Info.observationDate}, #{co2Info.standardCoalEmissionFactor}, " +
            "#{co2Info.dailyCo2FromStandardCoalConsumptionfossilFuel}, #{co2Info.dailyCo2FromFossilFuel})")
    int insertCo2Info(Co2Info co2Info);
}
