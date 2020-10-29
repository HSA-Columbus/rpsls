package org.horizoncolumbus.hs;

import javax.swing.*;

public class OnePlayerUI extends JFrame {
    private JPanel singlePanel;
    private JLabel gestureLabel;
    private JButton spockButton;

    public OnePlayerUI(){
        add(singlePanel);
        setTitle("Single Player");
        setSize(400,290);
    }
}
