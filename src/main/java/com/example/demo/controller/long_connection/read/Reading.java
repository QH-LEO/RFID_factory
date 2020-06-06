package com.example.demo.controller.long_connection.read;

import java.util.Map;

/**
 * 发送给前台的消息体
 *
 * @author shipengfei
 * @data 19-12-5
 */
public class Reading {
    //当前已扫描riid类型及其对应的标签数
    private Map<String,Integer> clothesNum;
    //当前已扫描riid标签数，即实入库数
    private int num;
    //当前已扫描riid读取情况：是否为所要的类型的RFID（t/f）
    private String state;

    public Reading() {
    }

    public Reading(Map<String, Integer> clothesNum, int num, String state) {
        this.clothesNum = clothesNum;
        this.num = num;
        this.state = state;
    }


    public Map<String, Integer> getClothesNum() {
        return clothesNum;
    }

    public int getNum() {
        return num;
    }

    public String getState() {
        return state;
    }
}
