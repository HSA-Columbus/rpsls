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

    public GameUI() {
        add(rootPanel);
        setTitle("RPSLS");
        setSize(400,290);
        setLocation(screen.width/2 - getWidth()/2, screen.height/2 - getHeight()/2);
        singlePlayerButton.setVisible(false);
        twoPlayersButton.setVisible(false);
        playerSelectLabel.setVisible(false);
        rulesLabel.setVisible(false);
        rulesTextArea.setVisible(false);
        backButton.setVisible(false);
        playButton.addActionListener(e -> {
            welcomeLabel.setVisible(false);
            playButton.setVisible(false);
            rulesButton.setVisible(false);
            singlePlayerButton.setVisible(true);
            twoPlayersButton.setVisible(true);
            playerSelectLabel.setVisible(true);
            backButton.setVisible(true);
            backButton.addActionListener(e1 -> {
                welcomeLabel.setVisible(true);
                playButton.setVisible(true);
                rulesButton.setVisible(true);
                rulesLabel.setVisible(false);
                rulesTextArea.setVisible(false);
                backButton.setVisible(false);
                singlePlayerButton.setVisible(false);
                twoPlayersButton.setVisible(false);
                playerSelectLabel.setVisible(false);
            });

        });
        rulesButton.addActionListener(e -> {
            welcomeLabel.setVisible(false);
            playButton.setVisible(false);
            rulesButton.setVisible(false);
            rulesLabel.setVisible(true);
            rulesTextArea.setVisible(true);
            backButton.setVisible(true);
            backButton.addActionListener(e12 -> {
                welcomeLabel.setVisible(true);
                playButton.setVisible(true);
                rulesButton.setVisible(true);
                rulesLabel.setVisible(false);
                rulesTextArea.setVisible(false);
                backButton.setVisible(false);
            });
        });
        singlePlayerButton.addActionListener(e -> {
            OnePlayerUI onePlayerUI = new OnePlayerUI();
            onePlayerUI.setVisible(true);
        });
        twoPlayersButton.addActionListener(e -> {
            TwoPlayerUI twoPlayerUI = new TwoPlayerUI();
            twoPlayerUI.setVisible(true);
        });
    }
}