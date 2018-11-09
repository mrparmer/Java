package com.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays (long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
            long Days = minutes / 60;
            long Years = Days / 24;
            long yearsDiv = Years / 365;
            long yearsRem = Years % 365;
            System.out.println(minutes + " min = " + yearsDiv + " y and " + yearsRem + " d");
        }

    }

}
