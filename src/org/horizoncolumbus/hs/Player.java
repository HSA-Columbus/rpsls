package org.horizoncolumbus.hs;

public class Player {

    private String name;
    public int type;

    Player(String newName){
        name = newName;
    }

    public void changeName(String newName) { name = newName; }

    public void chooseGesture(String gesture) {
    }

}
