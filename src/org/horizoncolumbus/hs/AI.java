package org.horizoncolumbus.hs;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class AI extends Player{

    String[] names = {"Susan", "Ken", "Doraemon", "KITT", "RoboCob"};
    Random rnd = new Random();


    AI() {
        super("Computer");
        String newName = names[rnd.nextInt(5)];
        changeName(newName);
    }

}
