package com.example.demo.controller.long_connection.read;

/**
 * 接收前台消息的消息体
 *
 * @author shipengfei
 * @data 19-12-12
 */
public class SubmitMessage {
    //此次写入的RFID数量
    private int num;
    //此次写入的RFID簇对应的tag（uuid）
    private String uuid;
    //将要提交的RFID标签类型   eg:类型/款号/色号/尺码
    private String[] fourAttributes;

    public SubmitMessage() {
    }

    public SubmitMessage(int num, String uuid, String[] fourAttributes) {
        this.num = num;
        this.uuid = uuid;
        this.fourAttributes = fourAttributes;
    }

    public String getUuid() {
        return uuid;
    }

    public String[] getFourAttributes() {
        return fourAttributes;
    }

    public int getNum() {
        return num;
    }
}
