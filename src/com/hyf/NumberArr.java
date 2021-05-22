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
    private static double max;
    private static double min;

    // add前顺便将最大值和最小值设定好
    public void add(double d) {
        if (list.isEmpty()) {
            max = d;
            min = d;
        } else {
            if (d > max) {
                max = d;
            } else if (d < min) {
                min = d;
            }
        }
        list.add(d);
    }

    // 传入参数为String时先做类型转换
    public void add(String s) {
        add(Double.parseDouble(s));
    }

    // 返回去除最大最小值后的总和
    public double getSum() {
        double sum = 0;
        for (double i : list) {
            sum += i;
        }
        sum = sum - max - min;
        return sum;
    }

    // 返回去除最大最小值后的个数
    public int getLength() {
        return list.size() - 2;
    }
}
