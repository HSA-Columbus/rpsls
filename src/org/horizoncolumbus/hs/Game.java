package org.horizoncolumbus.hs;

import java.util.HashMap;
import java.util.Random;

public class Game {
    Player player1;
    Player player2;
    Random rand;
    public int gameMode;
    public boolean winnerFound;
    HashMap<String, Integer> gestureList;

    Game(){
        rand = new Random();
        gestureList = new HashMap(); //Gestures
        addGestures();
        winnerFound = false;
    }

    public void setGameMode(int newGameMode){
        gameMode = newGameMode;
    }

    public int getGameMode(){
        return gameMode;
    }

    //Print Gestures
    public HashMap<String, Integer> displayGestures(){
        return gestureList;
    }

    public void addGestures(){
        gestureList.put("Rock", 1);
        gestureList.put("Paper", 2);
        gestureList.put("Scissors", 3);
        gestureList.put("Spock", 4);
        gestureList.put("Lizard", 5);

    }

    public String displayWelcomeMessage(){
        return "Welcome to the Rock Paper Scissors Lizard Spock game!\n\n";
    }

    public String displayGameRules(){
        return "The game rules are: \n\n" +
                "Scissors cuts paper.  \nPaper covers rock.  " +
                "Rock crushes lizard.  \nLizard poisons Spock.  " +
                "Spock smashes scissors.  \nScissors decapitates lizard.  " +
                "Lizard eats paper.  \nPaper disproves Spock.  " +
                "Spock vaporizes rock.  \nRock crushes scissors.\n\n";
    }

    public void setPlayer1(String name){
        player1 = new Human(name);
    }

    public void setPlayer2AsAI(){
        player2 = new AI();
    }

    public void setPlayer2AsHuman(String name){
        player2 = new Human(name);
    }

    public void setPlayer1Gesture(String gesture){
        player1.gesture = gesture;
    }

    public void setPlayer2Gesture(String gesture){
        player2.gesture = gesture;
    }

    public String checkForRoundWinner(){
        String roundWinner;
        int difference = ((gestureList.get(player1.gesture) - gestureList.get(player2.gesture)) + 5) % 2;
        if (gestureList.get(player1.gesture) == gestureList.get(player2.gesture)){
            roundWinner = "It is tie!";
            return roundWinner;
        }
        if(difference == 1){
            roundWinner = player1.name + " wins";
            player1.numberOfWinns++;
        }
        else {
            roundWinner = player2.name + " wins";
            player2.numberOfWinns++;
        }
        return roundWinner;
    }


    public String checkForGameWinner(){
        String gameWinner;

        if (player1.numberOfWinns == 3){
            gameWinner = player1.name + " Wins the game!!";
            winnerFound = true;
        }
        else if(player2.numberOfWinns == 3){
            gameWinner = player2.name + " Wins the game!!";
            winnerFound = true;

        }
        else {
            gameWinner = "There is no clear game winner yet!";
        }
        return gameWinner;
    }

    public void endGame(){
    }

}
