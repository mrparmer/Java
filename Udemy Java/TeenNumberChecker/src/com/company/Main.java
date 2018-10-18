package com.company;

public class Main {

    public static void main(String[] args) {
        hasTeen(16,12,20);
    }
    public static boolean hasTeen(int value1, int value2, int value3){
        if(value1 > 12 && value1 < 20 ||value2 > 12 && value2 < 20 || value3 > 12 && value3 < 20){
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }

    }
}
