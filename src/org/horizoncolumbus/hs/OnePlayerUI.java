package org.horizoncolumbus.hs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OnePlayerUI extends JFrame {
    private JPanel singlePanel; // fixed singlePanel issue by adding the name field to it's property in the designer
    private JLabel gestureLabel;
    private JButton paperButton;
    private JButton rockButton;
    private JButton lizardButton;
    private JButton scissorsButton;
    private JButton spockButton;
    private JTextField player1TextField;
    private JButton continueButton;
    private JLabel askNameLabel;
    private JLabel p1Label;
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
        p1Label.setVisible(false);
        askNameLabel.setVisible(false);
        continueButton.setVisible(false);
    }

    public OnePlayerUI(){
        add(singlePanel);
        setTitle("Single Player");
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
                OnePlayerUI.this.dispose(); // dispose the current window after gameUI window is shown
            }
        });
        continueButton.addActionListener(e -> {
            HideScreen1();
            ShowScreen2();
        });
    }
}
