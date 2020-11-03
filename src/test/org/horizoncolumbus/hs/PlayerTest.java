package org.horizoncolumbus.hs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    // Create an object from the "SYSTEM UNDER TEST"
    Player SUT;

    @BeforeEach
    void setUp() {
        //Make sure the object is always new object without any previous stored data
        SUT = new Player("Player 1");
    }

    //Assert that changeName() can change the name of the Player
    @Test
    void changeName_realName_NameStringChanges() {
        String expectedName = "Farah";
        SUT.changeName(expectedName);
        assertEquals(expectedName, SUT.name);
    }


    @Test
    void chooseGesture() {
    }
}