package com.env.envbackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.env.envbackend.pojo.WaterVolume;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;

import java.util.Date;
import java.util.List;

@Mapper
public interface WaterVolumeMapper extends BaseMapper<WaterVolume> {
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

    /**
     * 查询所有水量数据
     */
    @Select("SELECT * FROM WATERVOLUME")
    List<WaterVolume> selectAllWaterVolume();

    /**
     * 按日期查询进水水量
     */
    @Select("SELECT * FROM WATERVOLUME WHERE observation_date = #{date}")
    WaterVolume selectByDate(@Param("date") Date date);
}
