package org.horizoncolumbus.hs;

import javax.swing.*;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		System.out.print("Enter CLI for command line interface and GUI for graphical user interface: ");
		Scanner cligui = new Scanner(System.in);
		String userresponse = cligui.next().toLowerCase();
		if (userresponse.equals("gui")) {
			GameUI gameUI = new GameUI();
			gameUI.setVisible(true);
			gameUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}else{
			Game newCLIGame = new Game();
			newCLIGame.startGame();
		}
	}
}