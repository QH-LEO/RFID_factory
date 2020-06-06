package com.example.demo.pojo;

/**
 * @author shipengfei
 * @data 19-11-6
 */
public class GoodsColor extends Basic{
    private String id;           // ID
    private String name;         // NAME 名称(款式、类型、色号、尺码)
    private String code;         // CODE 代码(类型、色号、尺码)
    private String factoryID;    // FACTORY_ID 工厂ID
    private String goodsStyleID; // GOOD_STYLE_ID 所属款号ID


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

    public String getGoodsStyleID() {
        return goodsStyleID;
    }

    public void setGoodsStyleID(String goodsStyleID) {
        this.goodsStyleID = goodsStyleID;
    }

    @Override
    public String toString() {
        return "GoodsColor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", factoryID='" + factoryID + '\'' +
                ", goodsStyleID='" + goodsStyleID + '\'' +
                '}';
    }
}
