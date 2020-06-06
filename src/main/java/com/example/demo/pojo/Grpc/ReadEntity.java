package com.example.demo.pojo.Grpc;

import java.io.Serializable;
import java.util.List;

/**
 * @author shipengfei
 * @data 19-12-6
 */

//用以在GrpcReading类，即在Grpc读取过程中临时存储读取到的数据
public class ReadEntity implements Serializable {

    //此次读取的RFID簇对应的tag（uuid）
    private String uuid;

    //此次读取的RFID数量
    private int num;

    //此次读取的RFID簇
    private List<String> rfids;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<String> getRfids() {
        return rfids;
    }

    public void setRfids(List<String> rfids) {
        this.rfids = rfids;
    }

    @Override
    public String toString() {
        return "ReadEntity{" +
                "uuid='" + uuid + '\'' +
                ", num=" + num +
                ", rfids=" + rfids +
                '}';
    }
}
