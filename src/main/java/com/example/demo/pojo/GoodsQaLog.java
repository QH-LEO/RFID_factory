package com.example.demo.pojo;

/**
 * @author shipengfei
 * @data 19-11-6
 */
public class GoodsQaLog extends Basic{
    private String id;           // ID
    private String factoryID;    // FACTORY_ID 工厂ID
    private String goodsID;  //GOODS_ID 商品ID
    private String qaID;     //QA_ID 质检员ID
    private String tailorID; //TAILOR_ID 缝纫技师ID
    private String status;    /* STATUS 商品当前状态
                               * TB_GOODS_QA_LOG 品质检记录表
                               * 状态(2.返修 3.销毁 4.合格)
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "GoodsQaLog{" +
                "id='" + id + '\'' +
                ", factoryID='" + factoryID + '\'' +
                ", goodsID='" + goodsID + '\'' +
                ", qaID='" + qaID + '\'' +
                ", tailorID='" + tailorID + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
