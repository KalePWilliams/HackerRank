package Challenges;

import java.text.DecimalFormat;

public class PlusMinus {

    //For a given array, calculate the fraction of elements that are positive, negative and zeros
    // format the output.print each result on a new line.

    static void plusMinus(int[] arr) {

        double positive = 0.0;
        double negative = 0.0;
        double zero = 0.0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0) positive++;
            else if (arr[i] < 0) negative++;
            else zero++;
        }
        DecimalFormat ft = new DecimalFormat("0.000000");
        System.out.println(ft.format(positive/arr.length));
        System.out.println(ft.format(negative/arr.length));
        System.out.println(ft.format(zero/arr.length));

    }

    public static void main(String[] args) {

        int[] arr = {1,4,-5,-7,0,1,2,0,0,0};

        plusMinus(arr);

    }


}
