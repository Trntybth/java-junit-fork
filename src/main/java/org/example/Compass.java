package org.example;

public class Compass {

     enum Point {
        NORTH, EAST, SOUTH, WEST

    }

    enum Direction{
          left,
          right
    }

    //check current index with loop then do everything else below
    /* my theory is that it will iterate through the array of objects
     *  it will then check if point input matches current index
     * if it does, it takes the index and add one, store as new index
     * return the new saved index (the next item in list)
     *
     * */
    public Point rotate(Point point, Direction direction){

        // create list of N E S W values
        // iterate over values, if point = i, return index plus 1 to represent next rotation
        Point[] compassDirections = Point.values(); // init new array of values
        int currentIndex = -1; // create array of compass point values
        int newIndex;
        for (int i = 0; i < compassDirections.length; i++) { // store current index
            if (point.equals(compassDirections[i])) {
                currentIndex = i;
            }
        }
        // if statement calculates new index position
        if (direction == Direction.right && currentIndex != -1) {
            newIndex = (currentIndex + 1) % compassDirections.length; // modulo to loop around - check modulo line explanation
            return compassDirections[newIndex];
        } else if (direction == Direction.left && currentIndex != -1) {
            newIndex = (currentIndex - 1 + compassDirections.length) % compassDirections.length; // check second modulo line explanation
            return compassDirections[newIndex];
        }

        /*   modulo line explanation:

         * when rotating right, if 3 + 1 is 4, this won't be anything in the array (only 0-3 index)
         * therefore we need to loop back around. by dividing 4 by 4(the index length) and getting
         * a remainder of 0, we set the new index to 0 therefore looping back around to the first index.
         * essentially we cannot move past 4 index places because of this operation.

         *check for modulo looping explanation >  https://banjocode.com/post/javascript/iterate-array-with-modulo

         *
         * for the second modulo line, if we minus one, and add the length (4), e.g. giving us from 0, to -1, then adding 4 to get to 3.
         * this would work in this case alone. however if we have 2, then we -1, we have 1, then we add the length we get 5...
         * the modulo then comes in and divides 5 by 4 leaving remainder 1 (bringing us back to when we just had 1 before)
         * this basically covers us in all situations and allows us to wrap around the loop again when the list length is exceeded.
         *  */


        return null;
    }

}
