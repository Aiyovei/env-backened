package com.env.envbackend.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * co2信息;

 */
@ApiModel(value = "co2信息",description = "")
@Table(name="CO2_INFO")
public class Co2Info implements Serializable,Cloneable{
    /** co2排放信息id */
    @Id
    @GeneratedValue
    @ApiModelProperty(name = "co2排放信息id",notes = "")
    private String co2Info ;
    /** 观测日期 */
    @ApiModelProperty(name = "观测日期",notes = "")
    private Date observationDate ;
    /** 标煤排放因子 */
    @ApiModelProperty(name = "标煤排放因子",notes = "")
    private Double standardCoalEmissionFactor ;
    /** 标煤使用量 */
    @ApiModelProperty(name = "标煤使用量",notes = "")
    private Double dailyCo2FromStandardCoalConsumptionfossilFuel ;
    /** 当天化石燃料燃烧产生的CO2 */
    @ApiModelProperty(name = "当天化石燃料燃烧产生的CO2",notes = "")
    private Double dailyCo2FromFossilFuel ;

    public Co2Info(String co2Info, Date observationDate, Double standardCoalEmissionFactor, Double dailyCo2FromStandardCoalConsumptionfossilFuel, Double dailyCo2FromFossilFuel) {
        this.co2Info = co2Info;
        this.observationDate = observationDate;
        this.standardCoalEmissionFactor = standardCoalEmissionFactor;
        this.dailyCo2FromStandardCoalConsumptionfossilFuel = dailyCo2FromStandardCoalConsumptionfossilFuel;
        this.dailyCo2FromFossilFuel = dailyCo2FromFossilFuel;
    }

    public Co2Info(Date observationDate, Double standardCoalEmissionFactor, Double dailyCo2FromStandardCoalConsumptionfossilFuel, Double dailyCo2FromFossilFuel) {
        this.observationDate = observationDate;
        this.standardCoalEmissionFactor = standardCoalEmissionFactor;
        this.dailyCo2FromStandardCoalConsumptionfossilFuel = dailyCo2FromStandardCoalConsumptionfossilFuel;
        this.dailyCo2FromFossilFuel = dailyCo2FromFossilFuel;
    }

    @Override
    public String toString() {
        return "Co2Info{" +
                "co2Info='" + co2Info + '\'' +
                ", observationDate=" + observationDate +
                ", standardCoalEmissionFactor=" + standardCoalEmissionFactor +
                ", dailyCo2FromStandardCoalConsumptionfossilFuel=" + dailyCo2FromStandardCoalConsumptionfossilFuel +
                ", dailyCo2FromFossilFuel=" + dailyCo2FromFossilFuel +
                '}';
    }

    /** 租户号 */
    public String getCo2Info(){
        return this.co2Info;
    }
    /** 租户号 */
    public void setCo2Info(String co2Info){
        this.co2Info=co2Info;
    }
    /** 观测日期 */
    public Date getObservationDate(){
        return this.observationDate;
    }
    /** 观测日期 */
    public void setObservationDate(Date observationDate){
        this.observationDate=observationDate;
    }
    /** 标煤排放因子 */
    public Double getStandardCoalEmissionFactor(){
        return this.standardCoalEmissionFactor;
    }
    /** 标煤排放因子 */
    public void setStandardCoalEmissionFactor(Double standardCoalEmissionFactor){
        this.standardCoalEmissionFactor=standardCoalEmissionFactor;
    }
    /** 标煤使用量 */
    public Double getDailyCo2FromStandardCoalConsumptionfossilFuel(){
        return this.dailyCo2FromStandardCoalConsumptionfossilFuel;
    }
    /** 标煤使用量 */
    public void setDailyCo2FromStandardCoalConsumptionfossilFuel(Double dailyCo2FromStandardCoalConsumptionfossilFuel){
        this.dailyCo2FromStandardCoalConsumptionfossilFuel=dailyCo2FromStandardCoalConsumptionfossilFuel;
    }
    /** 当天化石燃料燃烧产生的CO2 */
    public Double getDailyCo2FromFossilFuel(){
        return this.dailyCo2FromFossilFuel;
    }
    /** 当天化石燃料燃烧产生的CO2 */
    public void setDailyCo2FromFossilFuel(Double dailyCo2FromFossilFuel){
        this.dailyCo2FromFossilFuel=dailyCo2FromFossilFuel;
    }
}