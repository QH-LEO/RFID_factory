package com.example.demo.pojo;

/**
 * @author shipengfei
 * @data 19-11-6
 */
public class GoodsSize extends Basic{
    private String id;           // ID
    private String name;         // NAME 名称(款式、类型、色号、尺码)
    private String code;         // CODE 代码(类型、色号、尺码)
    private String factoryID;    // FACTORY_ID 工厂ID
    private String goodsColorID; // GOODS_COLOR_ID 所属色号ID

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFactoryID() {
        return factoryID;
    }

    public void setFactoryID(String factoryID) {
        this.factoryID = factoryID;
    }

    public String getGoodsColorID() {
        return goodsColorID;
    }

    public void setGoodsColorID(String goodsColorID) {
        this.goodsColorID = goodsColorID;
    }


    @Override
    public String toString() {
        return "GoodsSize{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", factoryID='" + factoryID + '\'' +
                ", goodsColorID='" + goodsColorID + '\'' +
                '}';
    }
}
