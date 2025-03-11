package com.env.envbackend.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.env.envbackend.Service.WatervolumeService;
import com.env.envbackend.pojo.WaterVolume;
import com.env.envbackend.mapper.WaterVolumeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

/**
* @author 21125
* @description 针对表【WATERVOLUME(水量信息)】的数据库操作Service实现
* @createDate 2025-03-11 17:39:55
*/
@Service
public class WatervolumeServiceImpl extends ServiceImpl<WaterVolumeMapper, WaterVolume>
    implements WatervolumeService{
    @Autowired
    WaterVolumeMapper waterVolumeMapper;
    @Override
    public BigInteger getSumWaterVolumeByFactoryId(Integer factoryId) {
        BigInteger res= BigInteger.valueOf(0);
        List<WaterVolume> allWaterVolumeInfoByFactoryId = waterVolumeMapper.getAllWaterVolumeInfoByFactoryId(1);
        for (WaterVolume water:
             allWaterVolumeInfoByFactoryId) {
            res .add(BigInteger.valueOf(water.getInfluentWaterFlow()));
        }
        return res;
    }
}




