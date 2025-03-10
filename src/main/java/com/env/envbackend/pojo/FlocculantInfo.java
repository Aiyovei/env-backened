package com.env.envbackend.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;
@ApiModel(value = "絮凝剂碳排放",description = "")
@Table(name="FlocculantInfo")
@Data
public class FlocculantInfo implements Serializable,Cloneable{
    @Id
    @GeneratedValue
    @ApiModelProperty(name = "絮凝剂信息id",notes = "")
    private String flocculantId ;

    @ApiModelProperty(name = "观测日期",notes = "")
    private Date observationDate ;
    //    碳源CO2排放因子
    @ApiModelProperty(name = "絮凝剂CO2排放因子",notes = "")
    private Double flocculantCo2EmissionFactor ;
    //    碳源使用量
    @ApiModelProperty(name = "絮凝剂使用量",notes = "")
    private Double flocculantUsage ;
    //    碳源浓度/质量分数
    @ApiModelProperty(name = "絮凝剂浓度/质量分数",notes = "")
    private Double flocculantConcentration;
//    当天絮凝剂碳排放
    @ApiModelProperty(name = "当天絮凝剂碳排放",notes = "")
    private Double DailyFlocculantCo2Emissions;
public FlocculantInfo(Date observationDate,Double flocculantCo2EmissionFactor ,Double flocculantUsage,Double flocculantConcentration,Double DailyFlocculantCo2Emissions){
    this.observationDate = observationDate;
    this.flocculantCo2EmissionFactor = flocculantCo2EmissionFactor;
    this.flocculantUsage = flocculantUsage;
    this.flocculantConcentration = flocculantConcentration;
    this.DailyFlocculantCo2Emissions = DailyFlocculantCo2Emissions;
}
    public FlocculantInfo( String flocculantId,Date observationDate,Double flocculantCo2EmissionFactor ,Double flocculantUsage,Double flocculantConcentration,Double DailyFlocculantCo2Emissions){
        this(observationDate,flocculantCo2EmissionFactor,flocculantUsage,flocculantConcentration,DailyFlocculantCo2Emissions);
        this.flocculantId = flocculantId;
    }

    @Override
    public String toString() {
        return "FlocculantInfo{" +
                "flocculantId='" + flocculantId + '\'' +
                ", observationDate=" + observationDate +
                ", flocculantCo2EmissionFactor=" + flocculantCo2EmissionFactor +
                ", flocculantUsage=" + flocculantUsage +
                ", flocculantConcentration=" + flocculantConcentration +
                ", DailyFlocculantCo2Emissions=" + DailyFlocculantCo2Emissions +
                '}';
    }

    public String getFlocculantId() {
        return flocculantId;
    }

    public void setFlocculantId(String flocculantId) {
        this.flocculantId = flocculantId;
    }

    public Date getObservationDate() {
        return observationDate;
    }

    public void setObservationDate(Date observationDate) {
        this.observationDate = observationDate;
    }

    public Double getFlocculantCo2EmissionFactor() {
        return flocculantCo2EmissionFactor;
    }

    public void setFlocculantCo2EmissionFactor(Double flocculantCo2EmissionFactor) {
        this.flocculantCo2EmissionFactor = flocculantCo2EmissionFactor;
    }

    public Double getFlocculantUsage() {
        return flocculantUsage;
    }

    public void setFlocculantUsage(Double flocculantUsage) {
        this.flocculantUsage = flocculantUsage;
    }

    public Double getFlocculantConcentration() {
        return flocculantConcentration;
    }

    public void setFlocculantConcentration(Double flocculantConcentration) {
        this.flocculantConcentration = flocculantConcentration;
    }

    public Double getDailyFlocculantCo2Emissions() {
        return DailyFlocculantCo2Emissions;
    }

    public void setDailyFlocculantCo2Emissions(Double dailyFlocculantCo2Emissions) {
        DailyFlocculantCo2Emissions = dailyFlocculantCo2Emissions;
    }
}
