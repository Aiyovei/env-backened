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
@ApiModel(value = "热耗信息", description = "")
@TableName("HEAT_INFO")
public class HeatInfo implements Serializable, Cloneable {
    @TableId(value = "HEAT_ID", type = IdType.AUTO)
    @ApiModelProperty(name = "热耗信息id", notes = "")
    private Integer heatId;

    @ApiModelProperty(name = "观测日期", notes = "")
    private Date observationDate;

    @ApiModelProperty(name = "标煤排放因子", notes = "")
    private BigDecimal standardCoalEmissionFactor;

    @ApiModelProperty(name = "外购标煤使用量", notes = "")
    private Integer purchasedStandardCoalUsage;

    @ApiModelProperty(name = "当天化石燃料燃烧产生的碳排放", notes = "")
    private BigDecimal dailyFossilFuelCo2Emissions;

    @ApiModelProperty(name = "水厂id",notes = "")
    private Integer factoryId ;

    @Override
    public String toString() {
        return "HeatInfo{" +
                "heatId=" + heatId +
                ", observationDate=" + observationDate +
                ", standardCoalEmissionFactor=" + standardCoalEmissionFactor +
                ", purchasedStandardCoalUsage=" + purchasedStandardCoalUsage +
                ", dailyFossilFuelCo2Emissions=" + dailyFossilFuelCo2Emissions +
                '}';
    }

    public HeatInfo(Date observationDate, BigDecimal standardCoalEmissionFactor, Integer purchasedStandardCoalUsage, BigDecimal dailyFossilFuelCo2Emissions, Integer factoryId) {
        this.observationDate = observationDate;
        this.standardCoalEmissionFactor = standardCoalEmissionFactor;
        this.purchasedStandardCoalUsage = purchasedStandardCoalUsage;
        this.dailyFossilFuelCo2Emissions = dailyFossilFuelCo2Emissions;
        this.factoryId = factoryId;
    }
    public HeatInfo(Integer heatId,Date observationDate, BigDecimal standardCoalEmissionFactor, Integer purchasedStandardCoalUsage, BigDecimal dailyFossilFuelCo2Emissions, Integer factoryId) {
        this(observationDate,
        standardCoalEmissionFactor,
        purchasedStandardCoalUsage,
        dailyFossilFuelCo2Emissions,
        factoryId);
        this.heatId = heatId;
    }

}

