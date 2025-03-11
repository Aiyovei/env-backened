package com.env.envbackend.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.env.envbackend.pojo.N2oInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;


/**
 * N2O信息;(N2O_INFO)表数据库访问层
 */
@Mapper
public interface N2oInfoMapper extends BaseMapper<N2oInfo> {
    /**
     * 通过ID查询单条数据
     *
     * @param n2oId 主键
     * @return 实例对象
     */
    N2oInfo queryById(String n2oId);
    /**
     * 分页查询指定行数据
     *
     * @param n2oInfo 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<N2oInfo> queryAllByLimit(N2oInfo n2oInfo, @Param("pageable") Pageable pageable);
    /**
     * 统计总行数
     *
     * @param n2oInfo 查询条件
     * @return 总行数
     */
    long count(N2oInfo n2oInfo);
    /**
     * 新增数据
     *
     * @param n2oInfo 实例对象
     * @return 影响行数
     */
    int insert(N2oInfo n2oInfo);
    /**
     * 批量新增数据
     *
     * @param entities List<N2oInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<N2oInfo> entities);
    /**
     * 批量新增或按主键更新数据
     *
     * @param entities List<N2oInfo> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<N2oInfo> entities);
    /**
     * 更新数据
     *
     * @param n2oInfo 实例对象
     * @return 影响行数
     */
    int update(N2oInfo n2oInfo);
    /**
     * 通过主键删除数据
     *
     * @param n2oId 主键
     * @return 影响行数
     */
    int deleteById(String n2oId);
}