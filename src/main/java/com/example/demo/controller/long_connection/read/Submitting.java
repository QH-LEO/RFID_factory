package com.example.demo.controller.long_connection.read;

/**
 * 发送给前台的消息体
 *
 * @author shipengfei
 * @data 19-12-11
 */
public class Submitting {
    //当前写入情况
    private String state;
    //当前写入RFID数量
    private int num;

    public Submitting() {
    }

    public Submitting(String state, int num) {
        this.state = state;
        this.num = num;
    }

    public String getState() {
        return state;
    }

    public int getNum() {
        return num;
    }
}
