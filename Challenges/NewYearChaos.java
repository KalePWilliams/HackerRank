package Challenges;

import java.util.HashMap;

public class NewYearChaos {




    static void minimumBribes(int[] arr) {

        int minBribes = 0;
        int bribe;
        int pos = 0;
        boolean tooChaotic = false;


        for(int i = arr.length-1; i >= 0; i--){//iterate backwards through the array

            int j = 0;                       //reinitialize j for every loop back to 0


            bribe = arr[pos] - (pos+1);      //if the number at the current position is closer to
            if (bribe > 2) {                 //the front of the queue than 2 positions from where
                tooChaotic = true;           //it should be, it has bribed too many times
            }
            if (arr[i] - 2 > 0){             //if the current value - 2 is more than 0
                j = arr[i] - 2;              //then j = 2 less than the current value
            }

            while(j <= i) {                  //this loop will increment minBribes once or twice
                if (arr[j] > arr[i]){        //depending on how far the value is from where it
                    minBribes++;             //should be
                }
                j++;
            }
            pos++;
        }

        if (!tooChaotic){
            System.out.println(minBribes);
        }
        else{
            System.out.println("Too chaotic");
        }

   }

    public static void main(String[] args){

        int[] arr1 = {2,1,5,3,4};
        int[] arr2 = {2,5,1,3,4};
        int[] arr3 = {5,1,2,3,7,8,6,4};
        int[] arr4 = {1,2,5,3,7,8,6,4};
        minimumBribes(arr1);
        minimumBribes(arr2);
        minimumBribes(arr3);
        minimumBribes(arr4);
    }
}
