package com.env.envbackend.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.env.envbackend.pojo.HeatInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Pageable;
import java.util.List;

/**
 * 热耗排放;(HEAT_INFO)表数据库访问层
 */
@Mapper
public interface HeatInfoMapper  extends BaseMapper<HeatInfo>{
    /**
     * 通过ID查询单条数据
     *
     * @param heatId 主键
     * @return 实例对象
     */
    HeatInfo queryById(String heatId);
    /**
     * 分页查询指定行数据
     *
     * @param heatInfo 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<HeatInfo> queryAllByLimit(HeatInfo heatInfo, @Param("pageable") Pageable pageable);
    /**
     * 统计总行数
     *
     * @param heatInfo 查询条件
     * @return 总行数
     */
    long count(HeatInfo heatInfo);
    /**
     * 新增数据
     *
     * @param heatInfo 实例对象
     * @return 影响行数
     */
    int insert(HeatInfo heatInfo);
    /**
     * 批量新增数据
     *
     * @param entities List<HeatInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<HeatInfo> entities);
    /**
     * 批量新增或按主键更新数据
     *
     * @param entities List<HeatInfo> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<HeatInfo> entities);
    /**
     * 更新数据
     *
     * @param heatInfo 实例对象
     * @return 影响行数
     */
    int update(HeatInfo heatInfo);
    /**
     * 通过主键删除数据
     *
     * @param heatId 主键
     * @return 影响行数
     */
    int deleteById(String heatId);}