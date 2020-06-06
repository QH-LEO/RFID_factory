package com.example.demo.pojo;

/**
 * @author shipengfei
 * @data 19-11-6
 */
public class GoodsStytle extends Basic{
    private String id;           // ID
    private String name;         // NAME 名称(款式、类型、色号、尺码)
    private String code;         // CODE 代码(类型、色号、尺码)
    private String factoryID;    // FACTORY_ID 工厂ID
    private String goodsTypeID;  // GOODS_TYPE_ID 所属商品类型ID


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

    public String getGoodsTypeID() {
        return goodsTypeID;
    }

    public void setGoodsTypeID(String goodsTypeID) {
        this.goodsTypeID = goodsTypeID;
    }

    @Override
    public String toString() {
        return "GoodsStytle{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", factoryID='" + factoryID + '\'' +
                ", goodsTypeID='" + goodsTypeID + '\'' +
                '}';
    }
}
