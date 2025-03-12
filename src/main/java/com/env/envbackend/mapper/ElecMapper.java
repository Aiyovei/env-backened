package com.env.envbackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.env.envbackend.pojo.ElecInfo;
import com.env.envbackend.pojo.WaterVolume;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface ElecMapper extends BaseMapper<ElecInfo> {
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

    @Select("SELECT * FROM ELEC_INFO WHERE observation_date BETWEEN #{startDate} AND #{endDate}")
    List<ElecInfo> getElecInfoBetweenDates(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

}