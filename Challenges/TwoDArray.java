package Challenges;

public class TwoDArray {

    /* Find the max sum of all possible hourglass shapes
    *  present in a 2D array. The pattern will consist of
    *  seven integers from -9 through 9 inclusive.
    *
    *           ***
    *            *
    *           ***
    * */

    static int hourglassSum(int[][] arr) {

        int max = -63; //if all values are -9 this would be the lowest possible value
        int sum = 0;

        // Iterate down the array
        for (int i = 0; i < 4; i++){

            // Iterate across the array
            for(int j = 0;j < 4 ;j++) {

                // Add the seven values for the hourglass pattern
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]+ arr[i+1][j+1]+
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                // Capture the highest value
                if (sum > max) max = sum;

            }
        }
        return max;
    }


    public static void main(String[] args){

        int[][] array =    {{1,1,1,0,0,0},
                            {0,1,0,0,0,0},
                            {1,1,1,0,0,0},
                            {0,0,2,4,4,0},  //  2,4,4
                            {0,0,0,2,0,0},  //    2
                            {0,0,1,2,4,0}}; //  1,2,4   highest value = 19

        System.out.println(hourglassSum(array));


    }
}