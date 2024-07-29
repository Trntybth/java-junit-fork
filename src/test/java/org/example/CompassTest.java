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
        Compass.Point initialPointNorth = Compass.Point.NORTH; // initialise point north to variable
        Compass.Direction directionToRotate = Compass.Direction.right; // initialise direction right to variable

        Compass.Point resultPoint = compass.rotate(initialPointNorth, directionToRotate); //rotate the point - this won't work yet

        Compass.Point expectedPoint = Compass.Point.EAST;
        assertEquals(expectedPoint, resultPoint, "The rotate method should correctly change NORTH to EAST when rotating RIGHT.");

    }

    @Test
    @DisplayName("Test rotate changes point correctly")

    void checkRotatePointCorrectly() {


        Compass.Direction directionToRotate = Compass.Direction.right; // initialise direction right to variable

        // results of rotating (hopefully)
        //Compass.Point is saying the variable will hold a Compass.Point enum result, as opposed to String, int, etc.
        Compass.Point northRotateRightResult = compass.rotate(Compass.Point.NORTH, directionToRotate); //rotate the point - this won't work yet
        Compass.Point eastRotateRightResult = compass.rotate(Compass.Point.EAST, directionToRotate);
        Compass.Point southRotateRightResult = compass.rotate(Compass.Point.SOUTH, directionToRotate);
        Compass.Point westRotateRightResult = compass.rotate(Compass.Point.WEST, directionToRotate);


        assertAll( // (expected thing, result actual thing)
                () -> assertEquals(Compass.Point.EAST, northRotateRightResult, "Passed north, should return east "),
                () -> assertEquals(Compass.Point.SOUTH, eastRotateRightResult, "Passed east, should return south"),
                () -> assertEquals(Compass.Point.WEST, southRotateRightResult, "Passed south, should return west"),
                () -> assertEquals(Compass.Point.NORTH, westRotateRightResult, "Passed west, should return north")
        );
    }

}