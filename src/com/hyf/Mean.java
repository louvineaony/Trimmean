package com.hyf;

/**
 * Created by hyf on 2021/5/22 2:32
 */
public class Mean {
    double sum;
    int length;

    public Mean(NumberArr arr) {
        sum = arr.getSum();
        length = arr.getLength();
    }

    public double getMean() {
        if (sum != 0 && length > 0) {
            return sum / length;
        }
        return 0;
    }
}
