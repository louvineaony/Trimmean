package com.hyf;

/**
 * Created by hyf on 2021/5/22 2:32
 */
public class Mean {
    private double mean;

    // 直接设置mean
    public Mean(NumberArr arr) {
        mean = arr.getTrimSum() != 0 && arr.getTrimLength() > 0 ? arr.getTrimSum() / arr.getTrimLength() : 0;
    }

    // 返回mean
    public double getMean() {
        return mean;
    }
}
