package com.env.envbackend.mapper;

import com.env.envbackend.pojo.FlocculantInfo;
import com.env.envbackend.pojo.MaterialInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FlocculantInfoMapper {
    @Select("SELECT * FROM FLOCCULANT_INFO WHERE Flocculant_Id = #{flocculantId}")
    MaterialInfo findByFlocculantId(@Param("flocculantId") String flocculantId);
    @Insert("Insert into FLOCCULANT_INFO "+
            "(Observation_Date,Flocculant_Co2_Emission_Factor,Flocculant_Usage,"+
            "Flocculant_Concentration,Daily_Flocculant_Co2_Emissions)"+
            "VALUES "+
            "(#{observationDate},#{flocculantCo2EmissionFactor},#{flocculantUsage},"+
            "#{flocculantConcentration},#{DailyFlocculantCo2Emissions})")
    int insertFLOCCULANT_INFO(FlocculantInfo flocculantInfo);

}
