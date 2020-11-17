package org.horizoncolumbus.hs;

public class Player {
    public String gesture;
    public String name;
    public int numberOfWinns;

    Player(String newName){
        name = newName;
        numberOfWinns = 0;
    }

    public void changeName(String newName) { name = newName; }

    public void chooseGesture(String gesture) {

    }

}
