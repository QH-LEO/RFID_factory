package com.example.demo.controller.long_connection.read;

/**
 * 接收前台消息的消息体
 *
 * @author shipengfei
 * @data 19-12-3
 */
public class ReadMessage {
    //应入库数
    private int num;
    //将要读取的RFID标签类型   eg:类型/款号/色号/尺码
    private String[] fourAttributes;

    public ReadMessage() {
    }

    public ReadMessage(int num, String[] fourAttributes) {
        this.num = num;
        this.fourAttributes = fourAttributes;
    }

    public int getNum() {
        return num;
    }

    public String[] getFourAttributes() {
        return fourAttributes;
    }

}
