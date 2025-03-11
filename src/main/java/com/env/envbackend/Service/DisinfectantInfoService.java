package com.env.envbackend.Service;

import com.env.envbackend.pojo.DisinfectantInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;


/**
 * 消毒剂信息;(DISINFECTANT_INFO)表服务接口
 */
public interface DisinfectantInfoService{

    /**
     * 通过ID查询单条数据
     *
     * @param disinfectantId 主键
     * @return 实例对象
     */
    DisinfectantInfo queryById(String disinfectantId);
    /**
     * 分页查询
     *
     * @param disinfectantInfo 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<DisinfectantInfo> paginQuery(DisinfectantInfo disinfectantInfo, PageRequest pageRequest);
    /**
     * 新增数据
     *
     * @param disinfectantInfo 实例对象
     * @return 实例对象
     */
    DisinfectantInfo insert(DisinfectantInfo disinfectantInfo);
    /**
     * 更新数据
     *
     * @param disinfectantInfo 实例对象
     * @return 实例对象
     */
    DisinfectantInfo update(DisinfectantInfo disinfectantInfo);
    /**
     * 通过主键删除数据
     *
     * @param disinfectantId 主键
     * @return 是否成功
     */
    boolean deleteById(String disinfectantId);

    List<DisinfectantInfo>queryDailyDisinfectantCo2EmissionsByFactoryId(Integer factoryId);

}