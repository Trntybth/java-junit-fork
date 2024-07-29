package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompassTest {
    Compass compass;
    @BeforeEach
    void Setup() {
        compass =new Compass();
    }


    @Test
    @DisplayName("Test rotate method works")

    public void checkRotatePointCorrectly{

        Compass compass= new Compass(Compass.Point.south);





    }

}