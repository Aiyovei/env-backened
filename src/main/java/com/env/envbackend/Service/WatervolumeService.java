package com.env.envbackend.Service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.env.envbackend.pojo.WaterVolume;
import io.swagger.models.auth.In;

import java.math.BigInteger;

/**
* @author wzj
* @description 针对表【WATERVOLUME(水量信息)】的数据库操作Service
* @createDate 2025-03-11 17:39:55
*/
public interface WatervolumeService extends IService<WaterVolume> {
    public BigInteger  getSumWaterVolumeByFactoryId(Integer factoryId);

}
