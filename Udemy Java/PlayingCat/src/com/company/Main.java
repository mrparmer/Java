package com.company;

public class Main {

    public static void main(String[] args) {
        isCatPlaying(false, 30);
    }

    public static boolean isCatPlaying (boolean summer, int temperature){
        if (temperature > 24 && temperature < 36){
            System.out.println("not summer");
            return true;
        }

        else if (summer && temperature > 24 && temperature < 46){
            System.out.println("is summer");
            return true;
        }

        System.out.println("not playing");
        return false;
    }
}
