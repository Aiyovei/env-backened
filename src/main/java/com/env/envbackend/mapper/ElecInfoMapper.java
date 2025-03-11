package com.env.envbackend.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.env.envbackend.pojo.ElecInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;


/**
 * 电耗信息;(ELEC_INFO)表数据库访问层
 * @author : http://www.chiner.pro
 * @date : 2025-3-11
 */
@Mapper
public interface ElecInfoMapper extends BaseMapper<ElecInfo> {
    /**
     * 通过ID查询单条数据
     *
     * @param elecId 主键
     * @return 实例对象
     */
    ElecInfo queryById(String elecId);
    /**
     * 分页查询指定行数据
     *
     * @param elecInfo 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<ElecInfo> queryAllByLimit(ElecInfo elecInfo, @Param("pageable") Pageable pageable);
    /**
     * 统计总行数
     *
     * @param elecInfo 查询条件
     * @return 总行数
     */
    long count(ElecInfo elecInfo);
    /**
     * 新增数据
     *
     * @param elecInfo 实例对象
     * @return 影响行数
     */
    int insert(ElecInfo elecInfo);
    /**
     * 批量新增数据
     *
     * @param entities List<ElecInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ElecInfo> entities);
    /**
     * 批量新增或按主键更新数据
     *
     * @param entities List<ElecInfo> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<ElecInfo> entities);
    /**
     * 更新数据
     *
     * @param elecInfo 实例对象
     * @return 影响行数
     */
    int update(ElecInfo elecInfo);
    /**
     * 通过主键删除数据
     *
     * @param elecId 主键
     * @return 影响行数
     */
    int deleteById(String elecId);
}