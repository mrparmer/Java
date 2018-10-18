package com.company;

public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2050);

    }
    public static void printMegaBytesAndKiloBytes (int kiloBytes){


        int mega = kiloBytes/1024;
        int rekilo = kiloBytes%1024;

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else {

            System.out.println(kiloBytes + " KB = " + mega + " MB and " + rekilo + " KB");
        }
    }
}
