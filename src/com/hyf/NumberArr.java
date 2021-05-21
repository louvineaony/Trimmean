package com.hyf;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyf on 2021/5/22 2:46
 */
public class NumberArr {
    private List<Double> list = new ArrayList<>();
    private boolean isNull = true;

    public void add(double x) {
        if (isNull) {
            list.add(x);
            ExcludedNum.max = x;
            ExcludedNum.min = x;
            isNull = !isNull;
        } else {
            list.add(x);
            if (x > ExcludedNum.max) {
                ExcludedNum.max = x;
            } else if (x < ExcludedNum.min) {
                ExcludedNum.min = x;
            }
        }
    }

    public double getSum() {
        double sum = 0;
        for (double i : list) {
            sum += i;
        }
        sum = sum - ExcludedNum.max - ExcludedNum.min;
        return sum;
    }

    public int getLength() {
        return list.size() - 2;
    }

    public static class ExcludedNum {
        static double max;
        static double min;
    }
}
