package com.env.envbackend.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.env.envbackend.pojo.CoagulantInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;


/**
 * 混凝剂信息;(COAGULANT_INFO)表数据库访问层
 */
@Mapper
public interface CoagulantInfoMapper extends BaseMapper<CoagulantInfo> {
    /**
     * 通过ID查询单条数据
     *
     * @param coagulantId 主键
     * @return 实例对象
     */
    CoagulantInfo queryById(String coagulantId);
    /**
     * 分页查询指定行数据
     *
     * @param coagulantInfo 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<CoagulantInfo> queryAllByLimit(CoagulantInfo coagulantInfo, @Param("pageable") Pageable pageable);
    /**
     * 统计总行数
     *
     * @param coagulantInfo 查询条件
     * @return 总行数
     */
    long count(CoagulantInfo coagulantInfo);
    /**
     * 新增数据
     *
     * @param coagulantInfo 实例对象
     * @return 影响行数
     */
    int insert(CoagulantInfo coagulantInfo);
    /**
     * 批量新增数据
     *
     * @param entities List<CoagulantInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CoagulantInfo> entities);
    /**
     * 批量新增或按主键更新数据
     *
     * @param entities List<CoagulantInfo> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<CoagulantInfo> entities);
    /**
     * 更新数据
     *
     * @param coagulantInfo 实例对象
     * @return 影响行数
     */
    int update(CoagulantInfo coagulantInfo);
    /**
     * 通过主键删除数据
     *
     * @param coagulantId 主键
     * @return 影响行数
     */
    int deleteById(String coagulantId);
}