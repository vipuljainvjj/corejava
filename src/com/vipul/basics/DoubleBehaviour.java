package com.vipul.basics;

public class DoubleBehaviour {

    public static void main(String[] args) {

        String str1 = "0.2";
        String str2 = "0.3";
        double d1 = Double.parseDouble(str1);
        double d2 = Double.parseDouble(str2);

        System.out.println(d2-d1);

        double d3 = 0.3;
        double d4 = 0.1;
        double d5 = d3-d4;

        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);

    }
}
