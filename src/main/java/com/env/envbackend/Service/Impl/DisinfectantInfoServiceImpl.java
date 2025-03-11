package com.env.envbackend.Service.Impl;

import com.env.envbackend.Service.DisinfectantInfoService;
import com.env.envbackend.mapper.DisinfectantInfoMapper;
import com.env.envbackend.pojo.DisinfectantInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import java.util.Date;
import java.util.List;

/**
 * 消毒剂信息;(DISINFECTANT_INFO)表服务实现类

 */
@Service
public class DisinfectantInfoServiceImpl implements DisinfectantInfoService {
    @Autowired
    private DisinfectantInfoMapper disinfectantInfoMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param disinfectantId 主键
     * @return 实例对象
     */
    public DisinfectantInfo queryById(String disinfectantId){
        return disinfectantInfoMapper.queryById(disinfectantId);
    }

    /**
     * 分页查询
     *
     * @param disinfectantInfo 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    public Page<DisinfectantInfo> paginQuery(DisinfectantInfo disinfectantInfo, PageRequest pageRequest){
        long total = disinfectantInfoMapper.count(disinfectantInfo);
        return new PageImpl<>(disinfectantInfoMapper.queryAllByLimit(disinfectantInfo, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param disinfectantInfo 实例对象
     * @return 实例对象
     */
    public DisinfectantInfo insert(DisinfectantInfo disinfectantInfo){
        disinfectantInfo.setDailyDisinfectantCo2Emissions(
                disinfectantInfo.getDisinfectantCo2EmissionFactor()*
                        disinfectantInfo.getDisinfectantUsage()*
                        disinfectantInfo.getDisinfectantCo2EmissionFactor()
        );
        disinfectantInfoMapper.insert(disinfectantInfo);
        return disinfectantInfo;
    }

    /**
     * 更新数据
     *
     * @param disinfectantInfo 实例对象
     * @return 实例对象
     */
    public DisinfectantInfo update(DisinfectantInfo disinfectantInfo){
        disinfectantInfoMapper.update(disinfectantInfo);
        return queryById(disinfectantInfo.getDisinfectantId());
    }

    /**
     * 通过主键删除数据
     *
     * @param disinfectantId 主键
     * @return 是否成功
     */
    public boolean deleteById(String disinfectantId){
        int total = disinfectantInfoMapper.deleteById(disinfectantId);
        return total > 0;
    }

    @Override
    public List<DisinfectantInfo> queryDailyEmissionFactoryId(Integer factoryId) {
        return disinfectantInfoMapper.queryByFactoryId(factoryId);
    }



    public Double queryAllDisInfectantInfoByFactoryId(Integer factoryId){
        List<DisinfectantInfo> disinfectantInfos = disinfectantInfoMapper.queryByFactoryId(factoryId);
        Double res =0.0;
        for (DisinfectantInfo dis :
                disinfectantInfos) {
            res+=dis.getDailyDisinfectantCo2Emissions();
        }

        return res;
    }

}