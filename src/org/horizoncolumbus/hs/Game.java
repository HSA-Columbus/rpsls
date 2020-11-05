package org.horizoncolumbus.hs;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    CLI newCLI = new CLI();

    Random rand = new Random();

    public int gameMode;

    public boolean winnerFound;

    public void setGameMode(int newGameMode){
        gameMode = newGameMode;
    }

    public int getGameMode(){
        return gameMode;
    }

    //Gestures
    ArrayList<String> gestureList = new ArrayList<String>();
    public void addGestures(){
        gestureList.add("Spock");
        gestureList.add("Rock");
        gestureList.add("Scissors");
        gestureList.add("Paper");
        gestureList.add("Lizard");

    }

    //Print Gestures
    public ArrayList<String> displayGestures(){

        return gestureList;
    }

    public void startGame(){
        addGestures();
        newCLI.welcomeMessage();
        newCLI.gameRules();
        setGameMode(newCLI.askForMode());
        if (gameMode == 1){
            Human player1 = new Human(newCLI.askForName("player 1's "));
            AI player2 = new AI("Susan");
            player1.gesture = newCLI.askForGesture();
            player2.gesture = gestureList.get(rand.nextInt(5));
            if (player1.gesture.equals(player2.gesture)){
                newCLI.displayWinner("No one won");
            }
            else if(player1.gesture.equals(gestureList.get(0)) && player2.gesture.equals(gestureList.get(1))){
                newCLI.displayWinner(player1.name + "wins");
            }
            else {
                newCLI.displayWinner(player2.name + "wins");
            }
        }
        else if (gameMode == 2){
            Human player1 = new Human(newCLI.askForName("player 1"));
            Human player2 = new Human(newCLI.askForName("player 2"));
        }
    }



    public void endGame(){
    }

}
