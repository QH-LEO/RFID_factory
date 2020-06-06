package com.example.demo.pojo;

/**
 * @author shipengfei
 * @data 19-10-25
 */
public class Data {

    //BASIC ATTRIBUTE
    private String version; // _VERSION 版本号,用于锁
    private String cuid;    // _CREATE_USER_ID 创建用户ID
    private String cname;   // _CREATE_USER_NAME 创建用户名
    private String ctime;   // _CREATE_TIME 创建时间
    private String uuid;    // _UPDATE_USER_ID 更新用户ID
    private String uname;   // _UPDATE_USER_NAME 更新用户名
    private String utime;   // _UPDATE_TIME 更新时间

    /* TB_GOODS_TYPE 商品类型表
     * TB_GOODS_STYLE   商品款号表
     * TB_GOODS_COLOR   商品色号表
     * TB_GOODS_SIZE    商品尺码表
     * TB_TAILOR_INFO   缝纫技师信息表
     * TB_OUTBOUND_TYPE 出库类型表
     */
    private String id;           // ID
    private String name;         // NAME 名称(款式、类型、色号、尺码)
    private String code;         // CODE 代码(类型、色号、尺码)
    private String factoryID;    // FACTORY_ID 工厂ID
    private String goodsTypeID;  // GOODS_TYPE_ID 所属商品类型ID
    private String goodsStyleID; // GOOD_STYLE_ID 所属款号ID
    private String goodsColorID; // GOODS_COLOR_ID 所属色号ID

    // TB_GOODS_INFO 商品信息表
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
                               * TB_GOODS_QA_LOG 品质检记录表
                               * 状态(2.返修 3.销毁 4.合格)
                               * TB_GOODS_INVENTORY_LOG 商品出入库记录表
                               * 状态(1.入库   2.出库)
                               *
                               */

    //TB_GOODS_QA_LOG 商品质检记录表
    private String goodsID;  //GOODS_ID 商品ID
    private String qaID;     //QA_ID 质检员ID
    private String tailorID; //TAILOR_ID 缝纫技师ID

    // TB_GOODS_INVENTORY_LOG 商品出入库记录表
    private String managerID; // MANAGER_ID 仓库管理人ID
    private String outID;     // OUTBOUND_TYPE_ID 出库类型ID
    private String outName;   // OUTBOUND_TYPE_NAME 出库名称

    private String tag;  // 数据域，即在操作时，将此次操作的服装标记为一批，
                         // 对其进行统一操作，用以标示身份

    private String state;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCuid() {
        return cuid;
    }

    public void setCuid(String cuid) {
        this.cuid = cuid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUtime() {
        return utime;
    }

    public void setUtime(String utime) {
        this.utime = utime;
    }

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

    public String getGoodsStyleID() {
        return goodsStyleID;
    }

    public void setGoodsStyleID(String goodsStyleID) {
        this.goodsStyleID = goodsStyleID;
    }

    public String getGoodsColorID() {
        return goodsColorID;
    }

    public void setGoodsColorID(String goodsColorID) {
        this.goodsColorID = goodsColorID;
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

    public String getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(String goodsID) {
        this.goodsID = goodsID;
    }

    public String getQaID() {
        return qaID;
    }

    public void setQaID(String qaID) {
        this.qaID = qaID;
    }

    public String getTailorID() {
        return tailorID;
    }

    public void setTailorID(String tailorID) {
        this.tailorID = tailorID;
    }

    public String getManagerID() {
        return managerID;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
    }

    public String getOutID() {
        return outID;
    }

    public void setOutID(String outID) {
        this.outID = outID;
    }

    public String getOutName() {
        return outName;
    }

    public void setOutName(String outName) {
        this.outName = outName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Data{" +
                "version='" + version + '\'' +
                ", cuid='" + cuid + '\'' +
                ", cname='" + cname + '\'' +
                ", ctime='" + ctime + '\'' +
                ", uuid='" + uuid + '\'' +
                ", uname='" + uname + '\'' +
                ", utime='" + utime + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", factoryID='" + factoryID + '\'' +
                ", goodsTypeID='" + goodsTypeID + '\'' +
                ", goodsStyleID='" + goodsStyleID + '\'' +
                ", goodsColorID='" + goodsColorID + '\'' +
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
                ", goodsID='" + goodsID + '\'' +
                ", qaID='" + qaID + '\'' +
                ", tailorID='" + tailorID + '\'' +
                ", managerID='" + managerID + '\'' +
                ", outID='" + outID + '\'' +
                ", outName='" + outName + '\'' +
                ", tag='" + tag + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
