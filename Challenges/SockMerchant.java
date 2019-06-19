package Challenges;

import java.util.Arrays;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        int matches = 0;

        Arrays.sort(ar);

        for (int i = 0; i < (n-1); i++){

            if (ar[i]==ar[i+1]){
                matches++;
                i++;
            }
        }
        return matches;
    }

    public static void main(String[] args){

        //test case
        int totalSocks = 9;
        int[] sockPile = {10,20,20,10,10,30,50,10,20}; //2 pairs of 10's and 1 pair of 20's
        int matches = sockMerchant(totalSocks, sockPile);

        System.out.println("The number of socks in the sock pile is: "+ totalSocks);
        System.out.println("From those socks we found " + matches + " pairs that match");
    }

}
