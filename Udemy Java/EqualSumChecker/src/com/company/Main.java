package com.company;

public class Main {

    public static void main(String[] args) {
        hasEqualSum(1001,1,2);
    }

    public static boolean hasEqualSum(int value1, int value2, int value3){
        int sumValue = value1 + value2;
        if (sumValue == value3){
            System.out.println("true");
            return true;

        }
        else {
            System.out.println("false");
            return false;
        }
    }
}
