package com.company;

public class Main {

    public static void main(String[] args) {
        area(5);
        area(-1, 4);
    }

    public static double area(double radius){
        double area = radius * radius * 3.14159;
        if (radius < 0) {
            System.out.println("Please input a valid, positive, value");
            return -1.0;
        }
        System.out.println("The radius of a circle is " + area + ".");
        return area;

    }

    public static double area (double x, double y){
        double area = x*y;

        if ((x < 0) || (y < 0)) {
            System.out.println("Please input a valid, positive, value");
            return -1.0;
        }
        System.out.println("The area of a rectangle is " + area + ".");
        return area;
    }
}
