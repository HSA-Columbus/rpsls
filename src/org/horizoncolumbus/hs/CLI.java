package org.horizoncolumbus.hs;

import java.util.Random;
import java.util.Scanner;

//CLI version
public class CLI {
    Game game;
    Scanner input;

    CLI(){
        game = new Game(); //game object
        input = new Scanner(System.in);
    }

    public void playCLIGame(){
        welcomeMessage();
        gameRules();

        int gameMode = askForMode();

        if(gameMode == 1){
            askForName();
            game.setPlayer2AsAI();
            System.out.println("\nWelcome " + game.player1.name + ". You're be playing against " + game.player2.name
                    + "\n");

        }else if (gameMode == 2){
            askForName();
            askForSecondName();
        }

        while (!game.winnerFound) {
            if (gameMode == 1) {
                askForPlayer1Gesture();
                game.setPlayer2Gesture(game.gestureList.keySet().toArray()[new Random().nextInt(5)].toString());
                System.out.println("\n" + game.player2.name + " choose " + game.player2.gesture + "\n");

            } else if (gameMode == 2) {
                askForPlayer1Gesture();
                askForPlayer2Gesture();
            }

            String roundWinner = game.checkForRoundWinner();
            displayRoundWinner(roundWinner);

            String gameWinner = game.checkForGameWinner();
            displayGameWinner(gameWinner);
        }

    }



    //display welcome message
    public void welcomeMessage(){
        System.out.println("\n \t ***************************** \n");

        System.out.println(game.displayWelcomeMessage());
        System.out.println("Hit \"Enter\" to display game rules!");
        input.nextLine();
    }

    public void gameRules(){
        System.out.println(game.displayGameRules());
        System.out.println("Hit \"Enter\" to choose game mode!");
        input.nextLine();
    }

    public int askForMode(){
        System.out.print("What game mode would you like to play? ");
        System.out.print("Enter (1) for Human vs AI and (2) for Human vs Human: ");
        //add Try-catch block here to protect from invalid inputs
        int gameMode = input.nextInt();
        game.setGameMode(gameMode);
        return gameMode;
    }


    public void askForName(){
        System.out.println("\n \t ***************************** \n");
        System.out.print("What is your name? ");
        String name = input.next();

        while (name.equals("")){
            System.out.print("Oops. Something went wrong! What is your name? ");
            name = input.nextLine();
        }
        game.setPlayer1(name);

    }

    public void askForSecondName(){
        System.out.print("What is the second player's name? ");
        String name = input.next();

        while (name.equals("")){
            System.out.print("Oops. Something went wrong! What is the second player's name? ");
            name = input.nextLine();
        }
        game.setPlayer2AsHuman(name);
    }

    public void askForPlayer1Gesture(){
        System.out.print("\n" + game.player1.name + ": Please choose one of the following: Rock, Paper, Scissors, Lizard, Spock: ");
        game.setPlayer1Gesture(input.next());
    }

    public void askForPlayer2Gesture(){
        System.out.print("\n" + game.player2.name + ": Please choose one of the following: Rock, Paper, Scissors, Lizard, Spock: ");
        game.setPlayer2Gesture(input.next());
    }

    public void displayRoundWinner(String Winner){
        System.out.println("\nRound Result: " + Winner);
    }

    public void displayGameWinner(String Winner){
        System.out.println("Game Result: " + Winner + "\n");
    }
}
