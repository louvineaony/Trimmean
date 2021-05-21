package com.hyf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberArr arr = new NumberArr();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (!s.equals("0")) {
            double d = Double.parseDouble(s);
            arr.add(d);
            s = sc.nextLine();
        }
        Mean mean = new Mean(arr);
        System.out.println(mean.getMean());
    }
}
