package com.env.envbackend.mapper;
import java.util.List;

import com.env.envbackend.pojo.FactortyInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;


/**
 * 污水厂信息;(FACTORTY_INFO)表数据库访问层
 */
@Mapper
public interface FactortyInfoMapper{
    /**
     * 通过ID查询单条数据
     *
     * @param factoryId 主键
     * @return 实例对象
     */
    FactortyInfo queryById(Integer factoryId);
    /**
     * 分页查询指定行数据
     *
     * @param factortyInfo 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<FactortyInfo> queryAllByLimit(FactortyInfo factortyInfo, @Param("pageable") Pageable pageable);
    /**
     * 统计总行数
     *
     * @param factortyInfo 查询条件
     * @return 总行数
     */
    long count(FactortyInfo factortyInfo);
    /**
     * 新增数据
     *
     * @param factortyInfo 实例对象
     * @return 影响行数
     */
    int insert(FactortyInfo factortyInfo);
    /**
     * 批量新增数据
     *
     * @param entities List<FactortyInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<FactortyInfo> entities);
    /**
     * 批量新增或按主键更新数据
     *
     * @param entities List<FactortyInfo> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<FactortyInfo> entities);
    /**
     * 更新数据
     *
     * @param factortyInfo 实例对象
     * @return 影响行数
     */
    int update(FactortyInfo factortyInfo);
    /**
     * 通过主键删除数据
     *
     * @param factoryId 主键
     * @return 影响行数
     */
    int deleteById(Integer factoryId);
}