package com.company;

public class Main {

    public static void main(String[] args) {
            getDurationString(85, 45);
            getDurationString(3945);
    }
    public static String getDurationString (int Minutes, int Seconds){
        if ( (Minutes < 0)|| (Seconds < 0) || (Seconds > 59)){
            System.out.println("Invalid Value");
            return "Invalid value";
        }
        int seconds = Seconds % 60;
        int minutes = Seconds / 60;
        int hoursFromSeconds = minutes / 60;
        int hours = hoursFromSeconds + Minutes/60;
        int minutesLeft = Minutes%60;
        int minutesFinal = minutesLeft + minutes;
        String output = hours + "hh " + minutesFinal + "m " + seconds + "s";
        System.out.println(output);
        return output;


    }
    public static String getDurationString (int Seconds){
        if (Seconds < 0){
            System.out.println("Invalid Value");
            return "Invalid value";
        }
        int seconds = Seconds % 60;
        int minutes = Seconds / 60;
        String output = minutes + "m " + seconds + "s";
        getDurationString(minutes, seconds);
        return output;
    }
}
