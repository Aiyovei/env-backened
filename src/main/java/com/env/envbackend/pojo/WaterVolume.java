package com.env.envbackend.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * 水量信息;
 * @date : 2025-3-9
 */
@ApiModel(value = "水量信息",description = "")
@Table(name="WATERVOLUME")
@Data
@ToString
public class WaterVolume implements Serializable,Cloneable{
    /** 水量信息id */
    @Id
    @GeneratedValue
    @ApiModelProperty(name = "水量信息id",notes = "")
    private String waterId ;
    /** 观测日期 */
    @ApiModelProperty(name = "观测日期",notes = "")
    private Date observationDate ;
    /** 进水流量（水量） */
    @ApiModelProperty(name = "进水流量（水量）",notes = "")
    private Integer influentWaterFlow ;
    /** 进水总氮(TN) */
    @ApiModelProperty(name = "进水总氮(TN)",notes = "")
    private Double influentTotalNitrogen ;
    /** 出水总氮(TN) */
    @ApiModelProperty(name = "出水总氮(TN)",notes = "")
    private Double effluentTotalNitrogen ;
    /** 进水化学需氧量(COD) */
    @ApiModelProperty(name = "进水化学需氧量(COD)",notes = "")
    private Double influentCod ;
    /** 出水化学需氧量(COD) */
    @ApiModelProperty(name = "出水化学需氧量(COD)",notes = "")
    private Double effluentCod ;
    /** 进水生化需氧量(BOD5) */
    @ApiModelProperty(name = "进水生化需氧量(BOD5)",notes = "")
    private Double influentBod5 ;
    /** 出水生化需氧量(BOD5) */
    @ApiModelProperty(name = "出水生化需氧量(BOD5)",notes = "")
    private Double effluentBod5 ;
    /** 出水氨氮(NH3-N) */
    @ApiModelProperty(name = "出水氨氮(NH3-N)",notes = "")
    private Double effluentAmmoniaN ;
    /** 污泥生成量(DS) */
    @ApiModelProperty(name = "污泥生成量(DS)",notes = "")
    private Double sludgeGeneration ;
    /** 工厂id */
    @ApiModelProperty(name = "工厂id",notes = "")
    private Integer factorId ;

    @Override
    public String toString() {
        return "WaterVolume{" +
                "waterId='" + waterId + '\'' +
                ", observationDate=" + observationDate +
                ", influentWaterFlow=" + influentWaterFlow +
                ", influentTotalNitrogen=" + influentTotalNitrogen +
                ", effluentTotalNitrogen=" + effluentTotalNitrogen +
                ", influentCod=" + influentCod +
                ", effluentCod=" + effluentCod +
                ", influentBod5=" + influentBod5 +
                ", effluentBod5=" + effluentBod5 +
                ", effluentAmmoniaN=" + effluentAmmoniaN +
                ", sludgeGeneration=" + sludgeGeneration +
                ", factorId=" + factorId +
                '}';
    }

    public Integer getFactorId() {
        return factorId;
    }

    public void setFactorId(Integer factorId) {
        this.factorId = factorId;
    }

    public WaterVolume(String waterId, Date observationDate, Integer influentWaterFlow, Double influentTotalNitrogen,
                       Double effluentTotalNitrogen, Double influentCod,
                       Double effluentCod, Double influentBod5,
                       Double effluentBod5, Double effluentAmmoniaN,
                       Double sludgeGeneration,Integer factorId) {

        this(observationDate,
        influentWaterFlow,
        influentTotalNitrogen,
         effluentTotalNitrogen,
         influentCod,
        effluentCod,
        influentBod5,
        effluentBod5,
        effluentAmmoniaN,
        sludgeGeneration,
        factorId);
        this.waterId = waterId;
    }

    public WaterVolume(Date observationDate, Integer influentWaterFlow, Double influentTotalNitrogen,
                       Double effluentTotalNitrogen, Double influentCod, Double effluentCod,
                       Double influentBod5, Double effluentBod5, Double effluentAmmoniaN,
                       Double sludgeGeneration,Integer factorId) {
        this.observationDate = observationDate;
        this.influentWaterFlow = influentWaterFlow;
        this.influentTotalNitrogen = influentTotalNitrogen;
        this.effluentTotalNitrogen = effluentTotalNitrogen;
        this.influentCod = influentCod;
        this.effluentCod = effluentCod;
        this.influentBod5 = influentBod5;
        this.effluentBod5 = effluentBod5;
        this.effluentAmmoniaN = effluentAmmoniaN;
        this.sludgeGeneration = sludgeGeneration;
        this.factorId = factorId;
    }

    /** 水量信息id */
    public String getWaterId(){
        return this.waterId;
    }
    /** 水量信息id */
    public void setWaterId(String waterId){
        this.waterId=waterId;
    }
    /** 观测日期 */
    public Date getObservationDate(){
        return this.observationDate;
    }
    /** 观测日期 */
    public void setObservationDate(Date observationDate){
        this.observationDate=observationDate;
    }
    /** 进水流量（水量） */
    public Integer getInfluentWaterFlow(){
        return this.influentWaterFlow;
    }
    /** 进水流量（水量） */
    public void setInfluentWaterFlow(Integer influentWaterFlow){
        this.influentWaterFlow=influentWaterFlow;
    }
    /** 进水总氮(TN) */
    public Double getInfluentTotalNitrogen(){
        return this.influentTotalNitrogen;
    }
    /** 进水总氮(TN) */
    public void setInfluentTotalNitrogen(Double influentTotalNitrogen){
        this.influentTotalNitrogen=influentTotalNitrogen;
    }
    /** 出水总氮(TN) */
    public Double getEffluentTotalNitrogen(){
        return this.effluentTotalNitrogen;
    }
    /** 出水总氮(TN) */
    public void setEffluentTotalNitrogen(Double effluentTotalNitrogen){
        this.effluentTotalNitrogen=effluentTotalNitrogen;
    }
    /** 进水化学需氧量(COD) */
    public Double getInfluentCod(){
        return this.influentCod;
    }
    /** 进水化学需氧量(COD) */
    public void setInfluentCod(Double influentCod){
        this.influentCod=influentCod;
    }
    /** 出水化学需氧量(COD) */
    public Double getEffluentCod(){
        return this.effluentCod;
    }
    /** 出水化学需氧量(COD) */
    public void setEffluentCod(Double effluentCod){
        this.effluentCod=effluentCod;
    }
    /** 进水生化需氧量(BOD5) */
    public Double getInfluentBod5(){
        return this.influentBod5;
    }
    /** 进水生化需氧量(BOD5) */
    public void setInfluentBod5(Double influentBod5){
        this.influentBod5=influentBod5;
    }
    /** 出水生化需氧量(BOD5) */
    public Double getEffluentBod5(){
        return this.effluentBod5;
    }
    /** 出水生化需氧量(BOD5) */
    public void setEffluentBod5(Double effluentBod5){
        this.effluentBod5=effluentBod5;
    }
    /** 出水氨氮(NH3-N) */
    public Double getEffluentAmmoniaN(){
        return this.effluentAmmoniaN;
    }
    /** 出水氨氮(NH3-N) */
    public void setEffluentAmmoniaN(Double effluentAmmoniaN){
        this.effluentAmmoniaN=effluentAmmoniaN;
    }
    /** 污泥生成量(DS) */
    public Double getSludgeGeneration(){
        return this.sludgeGeneration;
    }
    /** 污泥生成量(DS) */
    public void setSludgeGeneration(Double sludgeGeneration){
        this.sludgeGeneration=sludgeGeneration;
    }
}