package com.company;

public class Main {

    public static void main(String[] args) {
    }

    public static boolean bark (boolean barking, int hourOfDay){

        if (barking && ((hourOfDay < 8 && hourOfDay >=0) || (hourOfDay >22 && hourOfDay <= 24))){
            return true;
        }
        return false;

    }
}
