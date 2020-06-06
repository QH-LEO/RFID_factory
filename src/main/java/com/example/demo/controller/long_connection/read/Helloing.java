package com.example.demo.controller.long_connection.read;

/**
 * 用于给前端返回uuid（即tag）
 *
 * @author shipengfei
 * @data 19-12-5
 */
public class Helloing {
    //返回给前端的uuid，此次读取的RFID簇对应的tag（uuid）
    private String uuid;

    public Helloing() {
    }

    public Helloing(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }
}
