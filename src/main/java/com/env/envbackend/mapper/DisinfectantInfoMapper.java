package com.env.envbackend.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.env.envbackend.pojo.DisinfectantInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.domain.Pageable;


/**
 * 消毒剂信息;(DISINFECTANT_INFO)表数据库访问层
 * @author : http://www.chiner.pro
 * @date : 2025-3-11
 */
@Mapper
public interface DisinfectantInfoMapper extends BaseMapper<DisinfectantInfo> {
    
    /**
     * 通过ID查询单条数据
     *
     * @param disinfectantId 主键
     * @return 实例对象
     */
    DisinfectantInfo queryById(String disinfectantId);
    /**
     * 分页查询指定行数据
     *
     * @param disinfectantInfo 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<DisinfectantInfo> queryAllByLimit(DisinfectantInfo disinfectantInfo, @Param("pageable") Pageable pageable);
    /**
     * 统计总行数
     *
     * @param disinfectantInfo 查询条件
     * @return 总行数
     */
    long count(DisinfectantInfo disinfectantInfo);
    /**
     * 新增数据
     *
     * @param disinfectantInfo 实例对象
     * @return 影响行数
     */
    int insert(DisinfectantInfo disinfectantInfo);
    /**
     * 批量新增数据
     *
     * @param entities List<DisinfectantInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<DisinfectantInfo> entities);
    /**
     * 批量新增或按主键更新数据
     *
     * @param entities List<DisinfectantInfo> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<DisinfectantInfo> entities);
    /**
     * 更新数据
     *
     * @param disinfectantInfo 实例对象
     * @return 影响行数
     */
    int update(DisinfectantInfo disinfectantInfo);
    /**
     * 通过主键删除数据
     *
     * @param disinfectantId 主键
     * @return 影响行数
     */
    int deleteById(String disinfectantId);
    @Select("SELECT * FROM DISINFECTANT_INFO\n" +
            "WHERE Factory_Id = #{factoryId};")
    List<DisinfectantInfo> queryByFactoryId(Integer factoryId);
}