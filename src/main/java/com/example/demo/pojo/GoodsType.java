package com.example.demo.pojo;

/**
 * @author shipengfei
 * @data 19-11-6
 */
public class GoodsType extends Basic{

    private String id;           // ID
    private String name;         // NAME 名称(款式、类型、色号、尺码)
    private String factoryID;    // FACTORY_ID 工厂ID

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

    public String getFactoryID() {
        return factoryID;
    }

    public void setFactoryID(String factoryID) {
        this.factoryID = factoryID;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", factoryID='" + factoryID + '\'' +
                '}';
    }
}
