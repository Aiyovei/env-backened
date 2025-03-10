package com.env.envbackend.mapper;

import com.env.envbackend.pojo.MaterialInfo;
import org.apache.ibatis.annotations.*;

@Mapper
public interface MaterialInfoMapper {
    @Select("SELECT * FROM MATERIAL_INFO WHERE Material_Id = #{materialId}")
    MaterialInfo findByMaterialId(@Param("waterId") String materialId);
    @Insert("INSERT INTO MATERIAL_INFO " +
            "(Observation_Date, Carbon_Source_Co2_Emission_Factor, Carbon_Source_Usage, " +
            "Carbon_Source_Concentration, Daily_Carbon_Source_Co2_Emissions) " +
            "VALUES " +
            "(#{observationDate}, #{carbonSourceCo2EmissionFactor}, #{carbonSourceUsage}, " +
            "#{carbonSourceConcentration}, #{DailyCarbonSourceCo2Emissions})")
    int insertMaterialInfo(MaterialInfo materialInfo);


}
