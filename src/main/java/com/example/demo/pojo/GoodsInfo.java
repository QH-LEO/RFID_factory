package com.example.demo.pojo;

/**
 * @author shipengfei
 * @data 19-11-6
 */
public class GoodsInfo extends Basic{
    private String id;           // ID
    private String factoryID;    // FACTORY_ID 工厂ID
    private String RFID;      // RFID 对应RFID
    private String typeID;    // TYPE_ID 商品类型ID
    private String typeName;  // TYPE_NAME 商品类型名称
    private String styleID;   // STYLE_ID 商品款号ID
    private String styleName; // STYLE_NAME 商品款号名称
    private String colorID;   // COLOR_ID 商品色号ID
    private String colorName; // COLOR_NAME 商品色号名称
    private String sizeID;    // SIZE_ID 商品尺码ID
    private String sizeName;  // SIZE_NAME 商品尺码名称
    private String status;    /* STATUS 商品当前状态
                               * TB_GOODS_INFO 商品信息表
                               * 状态(1.待质检 2.返修 3.销毁 4.合格 5.入库 6.出库)
                               */

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

    public String getRFID() {
        return RFID;
    }

    public void setRFID(String RFID) {
        this.RFID = RFID;
    }

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getStyleID() {
        return styleID;
    }

    public void setStyleID(String styleID) {
        this.styleID = styleID;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public String getColorID() {
        return colorID;
    }

    public void setColorID(String colorID) {
        this.colorID = colorID;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getSizeID() {
        return sizeID;
    }

    public void setSizeID(String sizeID) {
        this.sizeID = sizeID;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //返回商品属性，格式为：
    //typeName_styleName_colorName_sizeName
    public String getFourAttributes(){
        return typeName+"/"+styleName+"/"+colorName+"/"+sizeName;
    }

    @Override
    public String toString() {
        return "GoodsInfo{" +
                "id='" + id + '\'' +
                ", factoryID='" + factoryID + '\'' +
                ", RFID='" + RFID + '\'' +
                ", typeID='" + typeID + '\'' +
                ", typeName='" + typeName + '\'' +
                ", styleID='" + styleID + '\'' +
                ", styleName='" + styleName + '\'' +
                ", colorID='" + colorID + '\'' +
                ", colorName='" + colorName + '\'' +
                ", sizeID='" + sizeID + '\'' +
                ", sizeName='" + sizeName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
