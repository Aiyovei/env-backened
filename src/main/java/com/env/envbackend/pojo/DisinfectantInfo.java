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
 * 消毒剂信息;
 * @author : http://www.chiner.pro
 * @date : 2025-3-11
 */
@ApiModel(value = "消毒剂信息",description = "")
@TableName("DISINFECTANT_INFO")
@Table(name="DISINFECTANT_INFO")
public class DisinfectantInfo implements Serializable,Cloneable{
    /** 租户号 */
    @Id
    @GeneratedValue
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(name = "租户号",notes = "")
    private String disinfectantId ;
    /** 观测日期 */
    @ApiModelProperty(name = "观测日期",notes = "")
    private Date observationDate ;
    /** 消毒剂CO2排放因子 */
    @ApiModelProperty(name = "消毒剂CO2排放因子",notes = "")
    private Double disinfectantCo2EmissionFactor ;
    /** 消毒剂使用量 */
    @ApiModelProperty(name = "消毒剂使用量",notes = "")
    private Double disinfectantUsage ;
    /** 消毒剂浓度/质量分数 */
    @ApiModelProperty(name = "消毒剂浓度/质量分数",notes = "")
    private Double disinfectantConcentration ;
    /** 当天消毒剂碳排放 */
    @ApiModelProperty(name = "当天消毒剂碳排放",notes = "")
    private Double dailyDisinfectantCo2Emissions ;
    /** 水厂id */
    @ApiModelProperty(name = "水厂id",notes = "")
    private Integer factoryId ;

    /** 租户号 */
    public String getDisinfectantId(){
        return this.disinfectantId;
    }
    /** 租户号 */
    public void setDisinfectantId(String disinfectantId){
        this.disinfectantId=disinfectantId;
    }
    /** 观测日期 */
    public Date getObservationDate(){
        return this.observationDate;
    }
    /** 观测日期 */
    public void setObservationDate(Date observationDate){
        this.observationDate=observationDate;
    }
    /** 消毒剂CO2排放因子 */
    public Double getDisinfectantCo2EmissionFactor(){
        return this.disinfectantCo2EmissionFactor;
    }
    /** 消毒剂CO2排放因子 */
    public void setDisinfectantCo2EmissionFactor(Double disinfectantCo2EmissionFactor){
        this.disinfectantCo2EmissionFactor=disinfectantCo2EmissionFactor;
    }
    /** 消毒剂使用量 */
    public Double getDisinfectantUsage(){
        return this.disinfectantUsage;
    }
    /** 消毒剂使用量 */
    public void setDisinfectantUsage(Double disinfectantUsage){
        this.disinfectantUsage=disinfectantUsage;
    }
    /** 消毒剂浓度/质量分数 */
    public Double getDisinfectantConcentration(){
        return this.disinfectantConcentration;
    }
    /** 消毒剂浓度/质量分数 */
    public void setDisinfectantConcentration(Double disinfectantConcentration){
        this.disinfectantConcentration=disinfectantConcentration;
    }
    /** 当天消毒剂碳排放 */
    public Double getDailyDisinfectantCo2Emissions(){
        return this.dailyDisinfectantCo2Emissions;
    }
    /** 当天消毒剂碳排放 */
    public void setDailyDisinfectantCo2Emissions(Double dailyDisinfectantCo2Emissions){
        this.dailyDisinfectantCo2Emissions=dailyDisinfectantCo2Emissions;
    }
    /** 水厂id */
    public Integer getFactoryId(){
        return this.factoryId;
    }
    /** 水厂id */
    public void setFactoryId(Integer factoryId){
        this.factoryId=factoryId;
    }

    @Override
    public String toString() {
        return "DisinfectantInfo{" +
                "disinfectantId='" + disinfectantId + '\'' +
                ", observationDate=" + observationDate +
                ", disinfectantCo2EmissionFactor=" + disinfectantCo2EmissionFactor +
                ", disinfectantUsage=" + disinfectantUsage +
                ", disinfectantConcentration=" + disinfectantConcentration +
                ", dailyDisinfectantCo2Emissions=" + dailyDisinfectantCo2Emissions +
                ", factoryId=" + factoryId +
                '}';
    }
    public DisinfectantInfo(Date observationDate, Double disinfectantCo2EmissionFactor,
                            Double disinfectantUsage, Double disinfectantConcentration,
                            Double dailyDisinfectantCo2Emissions, Integer factoryId) {
        this.observationDate = observationDate;
        this.disinfectantCo2EmissionFactor = disinfectantCo2EmissionFactor;
        this.disinfectantUsage = disinfectantUsage;
        this.disinfectantConcentration = disinfectantConcentration;
        this.dailyDisinfectantCo2Emissions = dailyDisinfectantCo2Emissions;
        this.factoryId = factoryId;
    }
    public DisinfectantInfo(String disinfectantId, Date observationDate,
                            Double disinfectantCo2EmissionFactor, Double disinfectantUsage,
                            Double disinfectantConcentration, Double dailyDisinfectantCo2Emissions,
                            Integer factoryId) {

        this(observationDate,
            disinfectantCo2EmissionFactor,
            disinfectantUsage,
            disinfectantConcentration,
            dailyDisinfectantCo2Emissions,
            factoryId);
        this.disinfectantId = disinfectantId;
    }


}