package com.company;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(12, 12);
        calcFeetAndInchesToCentimeters(- 200);

    }
     public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet < 0 )|| (inches < 0 ) || (inches > 12)){
            return -1;
        }
         double centimeters= ((feet * 12) + inches) * 2.54;
         System.out.println("Centimeters " + centimeters );
         return centimeters;
    }
//    public static double calcFeetAndInchesToCentimeters(double inches){
//        if(inches >= 0){
//            double centimeters = inches * 2.54;
//            System.out.println("Centimeters " + centimeters );
//            return centimeters;
//        }
//        else {
//            System.out.println("Invalid Entry, only input positive values");
//            return -1;
//        }
   // }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0 ){
            return -1;
        }
        double centimeters= inches * 2.54;
        System.out.println("Centimeters " + centimeters );
        return centimeters;
    }
}
