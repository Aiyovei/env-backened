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

@ApiModel(value = "物耗（碳源）碳排放",description = "")
@Table(name="MaterialInfo")
@Data
@ToString
public class MaterialInfo implements Serializable,Cloneable{




    //    碳源id
    @Id
    @GeneratedValue
    @ApiModelProperty(name = "碳源id",notes = "")
    private String materialId;
//    观测日期
    @ApiModelProperty(name = "观测日期",notes = "")
    private Date observationDate;
//    碳源CO2排放因子
    @ApiModelProperty(name = "碳源CO2排放因子",notes = "")
    private Double carbonSourceCo2EmissionFactor;
//    碳源使用量
    @ApiModelProperty(name = "碳源使用量",notes = "")
    private Double carbonSourceUsage;

    @Override
    public String toString() {
        return "MaterialInfo{" +
                "materialId='" + materialId + '\'' +
                ", observationDate=" + observationDate +
                ", carbonSourceCo2EmissionFactor=" + carbonSourceCo2EmissionFactor +
                ", carbonSourceUsage=" + carbonSourceUsage +
                ", carbonSourceConcentration=" + carbonSourceConcentration +
                ", DailyCarbonSourceCo2Emissions=" + DailyCarbonSourceCo2Emissions +
                '}';
    }

    //    碳源浓度/质量分数
@ApiModelProperty(name = "碳源浓度/质量分数",notes = "")
private Double carbonSourceConcentration;
//    当天碳源碳排放
    @ApiModelProperty(name = "当天碳源碳排放",notes = "")
    private Double DailyCarbonSourceCo2Emissions;

    public MaterialInfo( Date observationDate, Double carbonSourceCo2EmissionFactor, Double carbonSourceUsage, Double carbonSourceConcentration, Double dailyCarbonSourceCo2Emissions) {
        this.observationDate = observationDate;
        this.carbonSourceCo2EmissionFactor = carbonSourceCo2EmissionFactor;
        this.carbonSourceUsage = carbonSourceUsage;
        this.carbonSourceConcentration = carbonSourceConcentration;
        this.DailyCarbonSourceCo2Emissions = dailyCarbonSourceCo2Emissions;
    }
    public MaterialInfo( String materialId,Date observationDate, Double carbonSourceCo2EmissionFactor, Double carbonSourceUsage, Double carbonSourceConcentration, Double dailyCarbonSourceCo2Emissions) {
        this(observationDate,
        carbonSourceCo2EmissionFactor,
        carbonSourceUsage,
        carbonSourceConcentration,
        dailyCarbonSourceCo2Emissions);
        this.materialId = materialId;
    }

    public String getMaterialId() {
        return this.materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public Date getObservationDate() {
        return this.observationDate;
    }

    public void setObservationDate(Date observationDate) {
        this.observationDate = observationDate;
    }

    public Double getCarbonSourceCo2EmissionFactor() {
        return this.carbonSourceCo2EmissionFactor;
    }

    public void setCarbonSourceCo2EmissionFactor(Double carbonSourceCo2EmissionFactor) {
        this.carbonSourceCo2EmissionFactor = carbonSourceCo2EmissionFactor;
    }

    public Double getCarbonSourceUsage() {
        return this.carbonSourceUsage;
    }

    public void setCarbonSourceUsage(Double carbonSourceUsage) {
        this.carbonSourceUsage = carbonSourceUsage;
    }

    public Double getCarbonSourceConcentration() {
        return this.carbonSourceConcentration;
    }

    public void setCarbonSourceConcentration(Double carbonSourceConcentration) {
        this.carbonSourceConcentration = carbonSourceConcentration;
    }

    public Double getDailyCarbonSourceCo2Emissions() {
        return this.DailyCarbonSourceCo2Emissions;
    }

    public void setDailyCarbonSourceCo2Emissions(Double dailyCarbonSourceCo2Emissions) {
        this.DailyCarbonSourceCo2Emissions = dailyCarbonSourceCo2Emissions;
    }

}
