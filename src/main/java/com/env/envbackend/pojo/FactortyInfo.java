package com.env.envbackend.pojo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;
import java.io.Serializable;


/**
 * 污水厂信息;
 */
@ApiModel(value = "污水厂信息",description = "")
@Table(name="FACTORTY_INFO")
public class FactortyInfo implements Serializable,Cloneable{
    /** 工厂id */
    @Id
    @GeneratedValue
    @ApiModelProperty(name = "工厂id",notes = "")
    private Integer factoryId ;
    /** 工厂名 */
    @ApiModelProperty(name = "工厂名",notes = "")
    private String factoryName ;

    /** 工厂id */
    public Integer getFactoryId(){
        return this.factoryId;
    }
    /** 工厂id */
    public void setFactoryId(Integer factoryId){
        this.factoryId=factoryId;
    }
    /** 工厂名 */
    public String getFactoryName(){
        return this.factoryName;
    }
    /** 工厂名 */
    public void setFactoryName(String factoryName){
        this.factoryName=factoryName;
    }

    public FactortyInfo(Integer factoryId, String factoryName) {
        this.factoryId = factoryId;
        this.factoryName = factoryName;
    }

    public FactortyInfo() {
    }
}