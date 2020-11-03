package org.horizoncolumbus.hs;

import java.util.Scanner;

public class CLI {
    public void welcomeMessage(){
        System.out.println("Welcome to Rock Paper Scissors Lizard Spock!");
    }
    public void gameRules(){
        System.out.println("The game rules are:" +
                "Scissors cuts paper.  Paper covers rock.  " +
                "Rock crushes lizard.  Lizard poisons Spock.  " +
                "Spock smashes scissors.  Scissors decapitates lizard.  " +
                "Lizard eats paper.  Paper disproves Spock.  " +
                "Spock vaporizes rock.  Rock crushes scissors.");
    }
    public String askForMode(){
        System.out.println("What gamemode would you like to play? ");
        System.out.println("Enter the number 1 for Human vs AI and enter the number 2 for Human vs Human");
        Scanner input = new Scanner(System.in);
        return input.next();
    }
    public String askForName(String player){
        System.out.println(" What is " + player + "name?");
        Scanner playerName = new Scanner(System.in);
        return playerName.nextLine();
    }
    public String gestures(){
        System.out.println("Please choose one of the following: Rock, Paper, Scissors, Lizard, Spock");
        Scanner Gesture = new Scanner(System.in);
        return Gesture.next();
    }
    public void displayWinner(String Winner){
        System.out.println("The winner of the game is " + Winner);
    }
}
