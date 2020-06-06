package com.example.demo.pojo;

/**
 * @author shipengfei
 * @data 19-11-6
 */
public class TailorInfo extends Basic{
    private String id;           // ID
    private String factoryID;    // FACTORY_ID 工厂ID

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFactoryID() {
        return factoryID;
    }

    public void setFactoryID(String factoryID) {
        this.factoryID = factoryID;
    }

    @Override
    public String toString() {
        return "TailorInfo{" +
                "id='" + id + '\'' +
                ", factoryID='" + factoryID + '\'' +
                '}';
    }
}
