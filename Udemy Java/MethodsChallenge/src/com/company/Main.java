package com.company;

public class Main {

    public static void main(String[] args) {
        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Will", playerPosition );

        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Jack", playerPosition );

        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Sam", playerPosition );

        playerPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Erwin", playerPosition );
    }
    public static void displayHighScorePosition(String playersName, int playerPosition){

        System.out.println(playersName + " got into position " + playerPosition + " on the high score table.");

    }
    public static int calculateHighScorePosition(int playerScore) {

//        if (playerScore >= 1000){
//            return  1;
//        }
//        else if (playerScore >= 500){
//            return 2;
//        }
//        else if (playerScore >= 100) {
//            return 3;
//        }
//
//        return 4;
        int position = 4; //assuming position 4 will be returned
        if (playerScore >= 1000){
            return 1;
        }
        else if (playerScore >= 500){
            return 2;
        }
        if (playerScore >= 100){
            return 3;
        }
        return position;
    }




}
