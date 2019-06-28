package Challenges;


import java.lang.reflect.Array;
import java.util.*;

public class PickingNumbers {

    public static void pickingNumbers(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //create a HashMap to hold the occurances of each value
        Map<Integer,Integer> vals = new HashMap<>();
        for(int i=0; i < n; i++){
            int num = in.nextInt();
            if(vals.containsKey(num))
                vals.put(num, vals.get(num)+1);
            else
                vals.put(num, 1);
        }

        int longestArray = 0;

        //loop will iterate for each unique value in the given array
        //for each value it will check if there is a value one less (arr1) and one more (arr2)
        for(int i : vals.keySet())
        {
            int arry1 = (vals.containsKey(i-1)) ? vals.get(i) + vals.get(i-1) : vals.get(i);
            int array2 = (vals.containsKey(i+1)) ? vals.get(i) + vals.get(i+1) : vals.get(i);


            if(arry1 > longestArray)
                longestArray = arry1;
            if(array2 > longestArray)
                longestArray = array2;
        }
        System.out.println(longestArray);
    }
}
