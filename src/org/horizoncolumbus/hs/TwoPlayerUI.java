package org.horizoncolumbus.hs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowListener;

public class TwoPlayerUI extends JFrame {
    private JPanel twoPlayerPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JLabel gestureLabel;
    private JButton backButton;
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    public TwoPlayerUI(){
        add(twoPlayerPanel);
        setTitle("Two Player");
        setSize(400,290);
        setLocation(screen.width/2 - getWidth()/2, screen.height/2 - getHeight()/2);


        //Listen for window close to call back GameUI and dispose of the current
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                GameUI gameUI = new GameUI();
                gameUI.setVisible(true);
                TwoPlayerUI.this.dispose(); // dispose the current window after gameUI window is shown
            }
        });
    }


}
