package com.example.demo.pojo;

/**
 * @author shipengfei
 * @data 19-11-6
 */
public class GoodsInventoryLog extends Basic{
    private String id;           // ID
    private String factoryID;    // FACTORY_ID 工厂ID
    private String goodsID;   //GOODS_ID 商品ID
    private String managerID; // MANAGER_ID 仓库管理人ID
    private String outID;     // OUTBOUND_TYPE_ID 出库类型ID
    private String outName;   // OUTBOUND_TYPE_NAME 出库名称
    private String status;    /* STATUS 商品当前状态
                               * TB_GOODS_INVENTORY_LOG 商品出入库记录表
                               * 状态(1.入库   2.出库)
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "GoodsInventoryLog{" +
                "id='" + id + '\'' +
                ", factoryID='" + factoryID + '\'' +
                ", goodsID='" + goodsID + '\'' +
                ", managerID='" + managerID + '\'' +
                ", outID='" + outID + '\'' +
                ", outName='" + outName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
