package com.env.envbackend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;


import java.io.Serializable;
import java.util.Date;

/**
 * 混凝剂信息;
 * @author : http://www.chiner.pro
 * @date : 2025-3-11
 */
@ApiModel(value = "混凝剂信息",description = "")
@TableName("`COAGULANT_INFO`")
@Table(name="COAGULANT_INFO")
public class CoagulantInfo implements Serializable,Cloneable{
    /** 租户号 */
    @Id
    @GeneratedValue
    @ApiModelProperty(name = "租户号",notes = "")
    @TableId(type = IdType.AUTO)
    private String coagulantId ;
    /** 观测日期 */
    @ApiModelProperty(name = "观测日期",notes = "")
    private Date observationDate ;
    /** 混凝剂CO2排放因子 */
    @ApiModelProperty(name = "混凝剂CO2排放因子",notes = "")
    private Double coagulantCo2EmissionFactor ;
    /** 混凝剂使用量 */
    @ApiModelProperty(name = "混凝剂使用量",notes = "")
    private Double coagulantUsage ;
    /** 混凝剂浓度/质量分数 */
    @ApiModelProperty(name = "混凝剂浓度/质量分数",notes = "")
    private Double coagulantConcentration ;
    /** 每日混凝剂排放量 */
    @ApiModelProperty(name = "每日混凝剂排放量",notes = "")
    private Double dailyCoagulantCo2Emissions ;
    /** 水厂id */
    @ApiModelProperty(name = "水厂id",notes = "")
    private Integer factoryId ;

    /** 租户号 */
    public String getCoagulantId(){
        return this.coagulantId;
    }
    /** 租户号 */
    public void setCoagulantId(String coagulantId){
        this.coagulantId=coagulantId;
    }
    /** 观测日期 */
    public Date getObservationDate(){
        return this.observationDate;
    }
    /** 观测日期 */
    public void setObservationDate(Date observationDate){
        this.observationDate=observationDate;
    }
    /** 混凝剂CO2排放因子 */
    public Double getCoagulantCo2EmissionFactor(){
        return this.coagulantCo2EmissionFactor;
    }
    /** 混凝剂CO2排放因子 */
    public void setCoagulantCo2EmissionFactor(Double coagulantCo2EmissionFactor){
        this.coagulantCo2EmissionFactor=coagulantCo2EmissionFactor;
    }
    /** 混凝剂使用量 */
    public Double getCoagulantUsage(){
        return this.coagulantUsage;
    }
    /** 混凝剂使用量 */
    public void setCoagulantUsage(Double coagulantUsage){
        this.coagulantUsage=coagulantUsage;
    }
    /** 混凝剂浓度/质量分数 */
    public Double getCoagulantConcentration(){
        return this.coagulantConcentration;
    }
    /** 混凝剂浓度/质量分数 */
    public void setCoagulantConcentration(Double coagulantConcentration){
        this.coagulantConcentration=coagulantConcentration;
    }
    /** 每日混凝剂排放量 */
    public Double getDailyCoagulantCo2Emissions(){
        return this.dailyCoagulantCo2Emissions;
    }
    /** 每日混凝剂排放量 */
    public void setDailyCoagulantCo2Emissions(Double dailyCoagulantCo2Emissions){
        this.dailyCoagulantCo2Emissions=dailyCoagulantCo2Emissions;
    }
    /** 水厂id */
    public Integer getFactoryId(){
        return this.factoryId;
    }
    /** 水厂id */
    public void setFactoryId(Integer factoryId){
        this.factoryId=factoryId;
    }
    public CoagulantInfo(Date observationDate, Double coagulantCo2EmissionFactor,
                         Double coagulantUsage, Double coagulantConcentration,
                         Double dailyCoagulantCo2Emissions, Integer factoryId) {
        this.observationDate = observationDate;
        this.coagulantCo2EmissionFactor = coagulantCo2EmissionFactor;
        this.coagulantUsage = coagulantUsage;
        this.coagulantConcentration = coagulantConcentration;
        this.dailyCoagulantCo2Emissions = dailyCoagulantCo2Emissions;
        this.factoryId = factoryId;
    }
    public CoagulantInfo(String coagulantId, Date observationDate,
                         Double coagulantCo2EmissionFactor, Double coagulantUsage,
                         Double coagulantConcentration, Double dailyCoagulantCo2Emissions,
                         Integer factoryId) {

        this(observationDate,
         coagulantCo2EmissionFactor,
          coagulantUsage,
          coagulantConcentration,
          dailyCoagulantCo2Emissions,
          factoryId);
        this.coagulantId = coagulantId;
    }



    @Override
    public String toString() {
        return "CoagulantInfo{" +
                "coagulantId='" + coagulantId + '\'' +
                ", observationDate=" + observationDate +
                ", coagulantCo2EmissionFactor=" + coagulantCo2EmissionFactor +
                ", coagulantUsage=" + coagulantUsage +
                ", coagulantConcentration=" + coagulantConcentration +
                ", dailyCoagulantCo2Emissions=" + dailyCoagulantCo2Emissions +
                ", factoryId=" + factoryId +
                '}';
    }
}