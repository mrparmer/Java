package com.company;

public class Main {

    public static void main(String[] args) {
    double val1 = 20;
    double val2 = 80;
    double math = (val1 + val2) * 25;
        System.out.println(math);
    double math2 = math % 40;
        System.out.println(math2);
    if (math2 <= 20)
        System.out.println("Total was over the limit");


    }
}
