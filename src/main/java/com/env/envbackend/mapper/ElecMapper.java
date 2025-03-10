package com.env.envbackend.mapper;

import com.env.envbackend.pojo.ElecInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ElecMapper {
    /**
     * 插入电耗信息记录
     *
     * @param elecInfo 待插入的电耗信息实体
     * @return 影响的行数
     */
    @Insert("INSERT INTO ELEC_INFO(elec_id,observation_date, wastewater_plant_electricity_consumption, electricity_carbon_emission_factor, daily_electricity_co2_emissions) " +
            "VALUES(#{elecId},#{observationDate}, #{wastewaterPlantElectricityConsumption}, #{electricityCarbonEmissionFactor}, #{dailyElectricityCO2Emissions})")
   int insertElecInfo(ElecInfo elecInfo);
    @Select("SELECT * FROM ELEC_INFO WHERE elec_id=#{id}")
    ElecInfo getElecInfoById(@Param("id") Integer Id);
}
