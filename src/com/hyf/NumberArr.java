package com.hyf;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyf on 2021/5/22 2:46
 */
public class NumberArr {
    // ArrayList存储输入的数
    private List<Double> list = new ArrayList<>();
    // 最大值和最小值
    private double max = Double.MIN_VALUE;
    private double min = Double.MAX_VALUE;
    // 和与个数
    private double sum;
    private int length;

    // add&sum&length++，设定最大值和最小值
    public void add(double d) {
        if (d > max) {
            max = d;
        } else if (d < min) {
            min = d;
        }
        list.add(d);
        sum += d;
        length++;
    }

    // 传入参数为String时做类型转换
    public void add(String s) {
        add(Double.parseDouble(s));
    }

    // 返回去除最大最小值后的总和
    public double getTrimSum() {
        return max != Double.MIN_VALUE && min != Double.MAX_VALUE ? sum - max - min : 0;
    }

    // 返回去除最大最小值后的个数
    public int getTrimLength() {
        return length > 2 ? length - 2 : 0;
    }

    // 返回list，暂时没用处
    public List<Double> getList() {
        return list;
    }
}
