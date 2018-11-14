package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

//        int switchValue = 3;
//        switch(switchValue){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Was a 3, 4, or 5");
//                break;
//            default:
//                System.out.println("Was not one or two, three, four, or five");
//                break;
//        }

        char switchChar = 'e';
        switch (switchChar){
            case 'a':case 'b':case 'c':case 'd':case 'e':
                System.out.println(switchChar + " was found.");
                break;
            default:
                System.out.println("No valid value was input");
        }

        String month = "january";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("January");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
