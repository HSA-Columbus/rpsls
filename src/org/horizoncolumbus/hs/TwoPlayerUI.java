package org.horizoncolumbus.hs;

import javax.swing.*;

public class TwoPlayerUI extends JFrame {
    private JPanel twoPlayerPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JLabel gestureLabel;

    public TwoPlayerUI(){
        add(twoPlayerPanel);
        setTitle("Two Player");
        setSize(400,290);
    }
}
