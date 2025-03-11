package com.env.envbackend.mapper;
import java.util.List;

import com.env.envbackend.pojo.Co2Info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;


/**
 * co2信息;(CO2_INFO)表数据库访问层

 */
@Mapper
public interface Co2InfoMapper{
    /**
     * 通过ID查询单条数据
     *
     * @param co2Id 主键
     * @return 实例对象
     */
    Co2Info queryById(String co2Id);
    /**
     * 分页查询指定行数据
     *
     * @param co2Info 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<Co2Info> queryAllByLimit(Co2Info co2Info, @Param("pageable") Pageable pageable);
    /**
     * 统计总行数
     *
     * @param co2Info 查询条件
     * @return 总行数
     */
    long count(Co2Info co2Info);
    /**
     * 新增数据
     *
     * @param co2Info 实例对象
     * @return 影响行数
     */
    int insert(Co2Info co2Info);
    /**
     * 批量新增数据
     *
     * @param entities List<Co2Info> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Co2Info> entities);
    /**
     * 批量新增或按主键更新数据
     *
     * @param entities List<Co2Info> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Co2Info> entities);
    /**
     * 更新数据
     *
     * @param co2Info 实例对象
     * @return 影响行数
     */
    int update(Co2Info co2Info);
    /**
     * 通过主键删除数据
     *
     * @param co2Id 主键
     * @return 影响行数
     */
    int deleteById(String co2Id);
}