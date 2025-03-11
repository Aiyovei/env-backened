package com.env.envbackend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * N2O信息;

 */
@ApiModel(value = "N2O信息",description = "")

@TableName(value = "`N2O_INFO`") // 注意这里的反引号
@Table(name="`N2O_INFO`")
public class N2oInfo implements Serializable,Cloneable{
    /** n2o信息id */
    @Id
    @GeneratedValue
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(name = "n2o信息id",notes = "")
    private String n2oId ;
    /** 观测日期 */
    @ApiModelProperty(name = "观测日期",notes = "")
    private Date observationDate ;
    /** N2O排放因子 */
    @ApiModelProperty(name = "N2O排放因子",notes = "")
    private Double n2oEmissionFactor ;
    /** N2O/N2分子量比 */
    @ApiModelProperty(name = "N2O/N2分子量比",notes = "")
    private Double n2oToN2Ratio ;
    /** 当天N2O直接排放量 */
    @ApiModelProperty(name = "当天N2O直接排放量",notes = "")
    private Double dailyN2oDirectEmissions ;
    /** N2O温室效应指数 */
    @ApiModelProperty(name = "N2O温室效应指数",notes = "")
    private Integer n2oGlobalWarmingPotential ;
    /** 水厂id */
    @ApiModelProperty(name = "水厂id",notes = "")
    private Integer factoryId ;

    /** n2o信息id */
    public String getN2oId(){
        return this.n2oId;
    }
    /** n2o信息id */
    public void setN2oId(String n2oId){
        this.n2oId=n2oId;
    }
    /** 观测日期 */
    public Date getObservationDate(){
        return this.observationDate;
    }
    /** 观测日期 */
    public void setObservationDate(Date observationDate){
        this.observationDate=observationDate;
    }
    /** N2O排放因子 */
    public Double getN2oEmissionFactor(){
        return this.n2oEmissionFactor;
    }
    /** N2O排放因子 */
    public void setN2oEmissionFactor(Double n2oEmissionFactor){
        this.n2oEmissionFactor=n2oEmissionFactor;
    }
    /** N2O/N2分子量比 */
    public Double getN2oToN2Ratio(){
        return this.n2oToN2Ratio;
    }
    /** N2O/N2分子量比 */
    public void setN2oToN2Ratio(Double n2oToN2Ratio){
        this.n2oToN2Ratio=n2oToN2Ratio;
    }
    /** 当天N2O直接排放量 */
    public Double getDailyN2oDirectEmissions(){
        return this.dailyN2oDirectEmissions;
    }
    /** 当天N2O直接排放量 */
    public void setDailyN2oDirectEmissions(Double dailyN2oDirectEmissions){
        this.dailyN2oDirectEmissions=dailyN2oDirectEmissions;
    }
    /** N2O温室效应指数 */
    public Integer getN2oGlobalWarmingPotential(){
        return this.n2oGlobalWarmingPotential;
    }
    /** N2O温室效应指数 */
    public void setN2oGlobalWarmingPotential(Integer n2oGlobalWarmingPotential){
        this.n2oGlobalWarmingPotential=n2oGlobalWarmingPotential;
    }
    /** 水厂id */
    public Integer getFactoryId(){
        return this.factoryId;
    }
    /** 水厂id */
    public void setFactoryId(Integer factoryId){
        this.factoryId=factoryId;
    }

    public N2oInfo(Date observationDate, Double n2oEmissionFactor, Double n2oToN2Ratio, Double dailyN2oDirectEmissions, Integer n2oGlobalWarmingPotential, Integer factoryId) {
        this.observationDate = observationDate;
        this.n2oEmissionFactor = n2oEmissionFactor;
        this.n2oToN2Ratio = n2oToN2Ratio;
        this.dailyN2oDirectEmissions = dailyN2oDirectEmissions;
        this.n2oGlobalWarmingPotential = n2oGlobalWarmingPotential;
        this.factoryId = factoryId;
    }

    public N2oInfo(String n2oId, Date observationDate, Double n2oEmissionFactor, Double n2oToN2Ratio, Double dailyN2oDirectEmissions, Integer n2oGlobalWarmingPotential, Integer factoryId) {

        this(observationDate,
        n2oEmissionFactor,
        n2oToN2Ratio,
        dailyN2oDirectEmissions,
        n2oGlobalWarmingPotential,
        factoryId);
        this.n2oId = n2oId;
    }

    @Override
    public String toString() {
        return "N2oInfo{" +
                "n2oId='" + n2oId + '\'' +
                ", observationDate=" + observationDate +
                ", n2oEmissionFactor=" + n2oEmissionFactor +
                ", n2oToN2Ratio=" + n2oToN2Ratio +
                ", dailyN2oDirectEmissions=" + dailyN2oDirectEmissions +
                ", n2oGlobalWarmingPotential=" + n2oGlobalWarmingPotential +
                ", factoryId=" + factoryId +
                '}';
    }
}