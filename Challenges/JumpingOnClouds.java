package Challenges;

/*  -In this the player can jump either 1 or 2 elements at a time
*   -the player can only jump on 0 values (must jump over 1s)
*   -find the minimum jumps necessary to complete
*   -all array elements will be either 0 or 1 values
*   -1 values will never occupy the first or last element and
*    will never be repeated consecutively   */

public class JumpingOnClouds {

    static int jumpingOnClouds(int[] c) {

        //for an array of only 2 elements only 1 jump is possible
        //so skip the rest of the logic and return 1
        int minJumpsNeeded = 1;

        if (c.length >3) {
            minJumpsNeeded--; //minJumpsNeeded at 0 for arrays 3 elements and up

            // If the last three elements are 1,0,0 this will not be caught by
            // the for loop below, so minJumpsNeeded++ if this is true
            if (c[c.length - 1] == 0 && c[c.length - 2] == 0 && c[c.length - 3] == 1) {
                minJumpsNeeded++;
            }

            //jump by two elements whenever possible
            for (int i = 0; i < c.length - 2; i++) {
                if (c[(i + 2)] == 0) {
                    i++;
                    minJumpsNeeded++;
                } else {
                    minJumpsNeeded++;
                }
            }
        }
        return minJumpsNeeded;
    }

    public static void main(String[] args){

        //test case
        int[] c = {0,0,0,0,1,0};
        System.out.println("The minimum jumps required is: "+ jumpingOnClouds(c));

    }
}
