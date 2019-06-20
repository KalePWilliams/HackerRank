package Challenges;

import java.util.Arrays;

//sort an array and determine how many toys can be purchased for a given budget

public class MaximumToys {

    public static int maximumToys(int[] prices, int k) {

        // The array represents the prices of the toys
        // k is the given budget
        int totalToys = 0;

        Arrays.sort(prices);

        //After the array is sorted from lowest to highest price
        //subtract the price of each toy until no more can be
        //purchased with the given budget
        for (int i = 0; i < prices.length; i++){
            if (k > prices[i]) {
                k -= prices[i];
                totalToys++;
            }
        }

        return totalToys;

    }
    public static void main(String[] args) {

        //test case
        int[] prices = {1,12,5,111,200,1000,10};
        int budget = 50;
        System.out.println(maximumToys(prices, budget));


    }

}
