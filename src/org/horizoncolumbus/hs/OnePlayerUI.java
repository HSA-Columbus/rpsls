package org.horizoncolumbus.hs;

import javax.swing.*;
import java.awt.*;

public class OnePlayerUI extends JFrame {
    private JPanel singlePanel; // fixed singlePanel issue by adding the name field to it's property in the designer
    private JLabel gestureLabel;
    private JButton spockButton;
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

    public OnePlayerUI(){
        add(singlePanel);
        setTitle("Single Player");
        setSize(400,290);
        setLocation(screen.width/2 - getWidth()/2, screen.height/2 - getHeight()/2);

        //Listen for window close to call back GameUI and dispose of the current
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                GameUI gameUI = new GameUI();
                gameUI.setVisible(true);
                OnePlayerUI.this.dispose(); // dispose the current window after gameUI window is shown
            }
        });
    }
}
