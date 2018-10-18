package com.company;

public class Main {

    public static void main(String[] args) {
areEqualByThreeDecimalPlaces(3.1245, 3.124);    }

    public static boolean areEqualByThreeDecimalPlaces (double value1, double value2){
        int newValue1 = (int)(value1*1000);
        int newValue2 = (int)(value2*1000);
        if(newValue1 == newValue2){
            System.out.println("true");
            return true;}
        else
        System.out.println("false");
            return false;
    }
}
