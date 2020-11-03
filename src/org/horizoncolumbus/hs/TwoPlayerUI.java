package org.horizoncolumbus.hs;

import javax.swing.*;
import java.awt.*;

public class TwoPlayerUI extends JFrame {
    private JPanel twoPlayerPanel;
    private JButton rockButton;
    private JButton scissorsButton;
    private JButton paperButton;
    private JButton lizardButton;
    private JButton spockButton;
    private JLabel gestureLabel;
    private JButton continueButton;
    private JLabel player2Label;
    private JLabel player1Label;
    private JLabel askNameLabel;
    private JTextField player1TextField;
    private JTextField player2TextField;
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    public void ShowScreen2() {
        rockButton.setVisible(true);
        paperButton.setVisible(true);
        scissorsButton.setVisible(true);
        lizardButton.setVisible(true);
        spockButton.setVisible(true);
        gestureLabel.setVisible(true);
    }
    public void HideScreen1() {
        player1TextField.setVisible(false);
        player2TextField.setVisible(false);
        player1Label.setVisible(false);
        player2Label.setVisible(false);
        askNameLabel.setVisible(false);
        continueButton.setVisible(false);
    }

    public TwoPlayerUI(){
        add(twoPlayerPanel);
        setTitle("Two Player");
        setSize(400,290);
        setLocation(screen.width/2 - getWidth()/2, screen.height/2 - getHeight()/2);

        //initial hide
        rockButton.setVisible(false);
        paperButton.setVisible(false);
        scissorsButton.setVisible(false);
        lizardButton.setVisible(false);
        spockButton.setVisible(false);
        gestureLabel.setVisible(false);

        //Listen for window close to call back GameUI and dispose of the current
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                GameUI gameUI = new GameUI();
                gameUI.setVisible(true);
                TwoPlayerUI.this.dispose(); // dispose the current window after gameUI window is shown
            }
        });
        continueButton.addActionListener(e -> {
            ShowScreen2();
            HideScreen1();
        });
    }


}
