package Challenges;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {
        int b = a.length;

        //create a new array of the same length as a
        int[] leftRotated = new int[b];

        //copy the source array from position d to the end of the
        //source array to the new array starting at position 0
        System.arraycopy(a, d, leftRotated, 0, b - d);

        //copy the beginning of the source array to the remaining
        //length in the new array
        System.arraycopy(a, 0, leftRotated, b - d, d);

        //for testing purposes only, to see the new array
        for (int i = 0; i <leftRotated.length; i++){
            System.out.print(leftRotated[i]+ " ");
        }


        return leftRotated;


    }

    public static void main(String[] args){

        //test case
        int[] arr = {1,2,3,4,5};
        int n = 4;

        rotLeft(arr,n);


    }
}
