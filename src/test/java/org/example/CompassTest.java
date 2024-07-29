package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompassTest {
    Compass compass;
    @BeforeEach
    void Setup() {
        compass = new Compass();
    }


    @Test
    @DisplayName("Test rotate method works")

    void checkRotatePointCorrectlyEast() {
        Compass.Point initialPointNorth = Compass.Point.north; // initialise point north to variable
        Compass.Direction directionToRotate = Compass.Direction.right; // initialise direction right to variable

        Compass.Point resultPoint = compass.rotate(initialPointNorth, directionToRotate); //rotate the point - this won't work yet

        Compass.Point expectedPoint = Compass.Point.east;
        assertEquals(expectedPoint, resultPoint, "The rotate method should correctly change NORTH to EAST when rotating RIGHT.");

    }

    @Test
    @DisplayName("Test rotate changes point correctly")

    void checkRotatePointCorrectly() {


        Compass.Direction directionToRotate = Compass.Direction.right; // initialise direction right to variable

        // results of rotating (hopefully)
        Compass.Point northRotateRightResult = compass.rotate(Compass.Point.north, directionToRotate); //rotate the point - this won't work yet
        Compass.Point eastRotateRightResult = compass.rotate(Compass.Point.east, directionToRotate);
        Compass.Point southRotateRightResult = compass.rotate(Compass.Point.south, directionToRotate);
        Compass.Point westRotateRightResult = compass.rotate(Compass.Point.west, directionToRotate);


        assertAll( // (expected thing, result actual thing)
                () -> assertEquals(Compass.Point.east, northRotateRightResult, "Passed north, should return east "),
                () -> assertEquals(Compass.Point.south, eastRotateRightResult, "Passed east, should return south"),
                () -> assertEquals(Compass.Point.west, southRotateRightResult, "Passed south, should return west"),
                () -> assertEquals(Compass.Point.north, westRotateRightResult, "Passed west, should return north")
        );
    }

}