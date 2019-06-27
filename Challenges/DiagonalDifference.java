package Challenges;

public class DiagonalDifference {

    static int diagonalDifference(int[][] arr) {
        //find the abs diff btw the diagonals of a square 2D array (matrix)

        int result = 0;
        int sumTopLeft = 0;
        int sumTopRight = 0;
        int j = (arr.length -1);

        for (int i = 0; i < arr.length; i++){
            sumTopLeft = sumTopLeft + arr[i][i];    //starts at top left and goes down diagonally to the right
            sumTopRight = sumTopRight + arr[i][j];  //starts at top right and goes down diagonally to the left
            --j;
        }
        // get the absolute difference and return
        result = Math.abs(sumTopLeft - sumTopRight);
        return result;
    }

    public static void main(String[] args){

        //test case
        int[][] arr = {{13,3,2,1},  //top left diagonal 13,5,2,8 = 28
                        {3,5,3,3},  //top right diagonal 1,3,3,2 = 9
                        {4,3,2,1},  //                difference = 19
                        {2,4,6,8}};

        System.out.println(diagonalDifference(arr));
    }
}


