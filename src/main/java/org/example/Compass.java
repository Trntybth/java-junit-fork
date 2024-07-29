package org.example;

public class Compass {

     enum Point {
        north, south,west,east

    }

    enum Direction{
         left,
        right
    }

    private Point point;

    public Compass(Point point) {
        this.point = point;
    }





}
