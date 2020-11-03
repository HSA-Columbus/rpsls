package org.horizoncolumbus.hs;

import javax.swing.*;
import java.awt.*;

public class GameUI extends JFrame {

    private JPanel rootPanel;
    private JLabel welcomeLabel;
    private JButton playButton;
    private JButton rulesButton;
    private JButton twoPlayersButton;
    private JButton singlePlayerButton;
    private JLabel playerSelectLabel;
    private JTextArea rulesTextArea;
    private JLabel rulesLabel;
    private JButton backButton;

    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    public void ShowHome(){
        welcomeLabel.setVisible(true);
        playButton.setVisible(true);
        rulesButton.setVisible(true);
        rulesLabel.setVisible(false);
        rulesTextArea.setVisible(false);
        backButton.setVisible(false);
        singlePlayerButton.setVisible(false);
        twoPlayersButton.setVisible(false);
        playerSelectLabel.setVisible(false);
    }
    public void PlayScreen(){
        welcomeLabel.setVisible(false);
        playButton.setVisible(false);
        rulesButton.setVisible(false);
        singlePlayerButton.setVisible(true);
        twoPlayersButton.setVisible(true);
        playerSelectLabel.setVisible(true);
        backButton.setVisible(true);
    }
    public void ShowRules(){
        welcomeLabel.setVisible(false);
        playButton.setVisible(false);
        rulesButton.setVisible(false);
        rulesLabel.setVisible(true);
        rulesTextArea.setVisible(true);
        backButton.setVisible(true);
    }

    public GameUI() {
        add(rootPanel);
        setTitle("RPSLS");
        setSize(400,290);
        setLocation(screen.width/2 - getWidth()/2, screen.height/2 - getHeight()/2);

        //default operation for the close/exit button
        //Needed for the certainty question
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        //initial hide
        singlePlayerButton.setVisible(false);
        twoPlayersButton.setVisible(false);
        playerSelectLabel.setVisible(false);
        rulesLabel.setVisible(false);
        rulesTextArea.setVisible(false);
        backButton.setVisible(false);

        playButton.addActionListener(e -> {
            PlayScreen();
            backButton.addActionListener(e1 -> ShowHome());

        });
        rulesButton.addActionListener(e -> {
            ShowRules();
            backButton.addActionListener(e12 -> ShowHome());
        });
        singlePlayerButton.addActionListener(e -> {
            OnePlayerUI onePlayerUI = new OnePlayerUI();
            onePlayerUI.setVisible(true);
            this.dispose(); // dispose the current window after onePlayer is shown
        });
        twoPlayersButton.addActionListener(e -> {
            TwoPlayerUI twoPlayerUI = new TwoPlayerUI();
            twoPlayerUI.setVisible(true);
            this.dispose(); // dispose the current window after twoPlayer is shown
        });

        //Listen for window close to ask if the user is certain
        //If certain, exit the system
        //else, do nothing
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(null,
                        "Are you sure you want to exit the game?", "Exit Game?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
                    System.exit(0);
                }

            }
        });
    }
}