package org.horizoncolumbus.hs;

import java.util.ArrayList;

public class Game {

    public boolean gameMode;
    public boolean winnerFound;
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


    }





    public void endGame(){

    }

}
