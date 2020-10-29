package org.horizoncolumbus.hs;
import javax.swing.*;

public class GameUI extends JFrame {
    private JPanel rootPanel;
    private JButton singleplayerButton;
    private JButton rulesButton;
    private JButton multiplayerButton;
    private JLabel welcomeToRockPaperLabel;

    public GameUI() {
        add(rootPanel);

        setTitle("RPSLS");
        setSize(400, 500);
        }
}
