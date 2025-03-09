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
            "(co2_id, observation_date, standard_coal_emission_factor, " +
            "daily_co2_from_standard_coal_consumptionfossil_fuel, daily_co2_from_fossil_fuel) " +
            "VALUES " +
            "(#{co2Info}, #{observationDate}, #{standardCoalEmissionFactor}, " +
            "#{dailyCo2FromStandardCoalConsumptionfossilFuel}, #{dailyCo2FromFossilFuel})")
    int insertCo2Info(Co2Info co2Info);
}
