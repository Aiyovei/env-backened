package com.env.envbackend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel(value = "电耗信息",description = "")
@TableName("ELEC_INFO")
public class ElecInfo implements Serializable,Cloneable {
    @TableId(value = "ELEC_ID", type = IdType.AUTO)
    @ApiModelProperty(name = "电耗信息id",notes = "")
    private Integer elecId;

    @ApiModelProperty(name = "观测日期",notes = "")
    private Date observationDate;

    @ApiModelProperty(name = "污水厂电耗",notes = "")
    private Integer wastewaterPlantElectricityConsumption;

    @ApiModelProperty(name = "电耗碳排放因子",notes = "")
    private BigDecimal electricityCarbonEmissionFactor;

    @ApiModelProperty(name = "当天电耗碳排放",notes = "")
    private Integer dailyElectricityCO2Emissions;

    /** 水厂id */
    @ApiModelProperty(name = "水厂id",notes = "")
    private Integer factoryId ;
    public ElecInfo(Date observationDate, Integer wastewaterPlantElectricityConsumption, BigDecimal electricityCarbonEmissionFactor, Integer dailyElectricityCO2Emissions,Integer factoryId) {
        this.observationDate = observationDate;
        this.wastewaterPlantElectricityConsumption = wastewaterPlantElectricityConsumption;
        this.electricityCarbonEmissionFactor = electricityCarbonEmissionFactor;
        this.dailyElectricityCO2Emissions = dailyElectricityCO2Emissions;
        this.factoryId = factoryId;
    }

    public ElecInfo(Integer elecId, Date observationDate, Integer wastewaterPlantElectricityConsumption, BigDecimal electricityCarbonEmissionFactor, Integer dailyElectricityCO2Emissions,Integer factoryId) {
        this(observationDate,wastewaterPlantElectricityConsumption,electricityCarbonEmissionFactor,dailyElectricityCO2Emissions,factoryId);
        this.elecId = elecId;
    }

    @Override
    public String toString() {
        return "ElecInfo{" +
                "elecId=" + elecId +
                ", observationDate=" + observationDate +
                ", wastewaterPlantElectricityConsumption=" + wastewaterPlantElectricityConsumption +
                ", electricityCarbonEmissionFactor=" + electricityCarbonEmissionFactor +
                ", dailyElectricityCO2Emissions=" + dailyElectricityCO2Emissions +
                '}';
    }


}
