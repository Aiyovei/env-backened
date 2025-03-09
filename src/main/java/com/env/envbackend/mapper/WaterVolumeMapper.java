package com.env.envbackend.mapper;

import com.env.envbackend.pojo.WaterVolume;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
@Mapper
public interface WaterVolumeMapper {
    /**
     * 根据id选择水id
     * @param waterId 要查询的水量信息id
     * @return 水量信息对象
     */
    @Select("SELECT * FROM WATERVOLUME WHERE water_id = #{waterId}")
    WaterVolume findByWaterId(@Param("waterId") String waterId);
    /**
     * 插入新的水量信息记录。
     *
     * @param waterVolume 要插入的水量信息对象
     * @return 受影响的行数
     */
    @Insert("INSERT INTO WATERVOLUME " +
            "(observation_date, influent_water_flow, influent_total_nitrogen, " +
            "effluent_total_nitrogen, influent_cod, effluent_cod, influent_bod5, effluent_bod5, " +
            "effluent_ammonia_n, sludge_generation) " +
            "VALUES " +
            "(#{observationDate}, #{influentWaterFlow}, #{influentTotalNitrogen}, " +
            "#{effluentTotalNitrogen}, #{influentCod}, #{effluentCod}, #{influentBod5}, #{effluentBod5}, " +
            "#{effluentAmmoniaN}, #{sludgeGeneration})")
    int insertWaterVolume(WaterVolume waterVolume);
}
