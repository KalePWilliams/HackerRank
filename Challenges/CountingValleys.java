package Challenges;

/*  The countingValleys method will count the number
*   of times currentHeight goes below seaLevel
*/

public class CountingValleys {


    static int countingValleys(int n, String s) {

        int valleyCount = 0;
        int seaLevel = 0;
        int currentHeight = 0;

        String[] strArray = s.split("");

        if (strArray[0].equalsIgnoreCase("D")) valleyCount++;

        for (int i = 0; i < s.length()-1; i++){

            // increment or decrement currentHeight
            if (strArray[i].equalsIgnoreCase("U")) currentHeight++;
            if (strArray[i].equalsIgnoreCase("D")) currentHeight--;

            // every step down (D) from seaLevel means another valley
            if (currentHeight == seaLevel && strArray[i+1].equalsIgnoreCase("D"))
                valleyCount++;

        }

        return valleyCount;

    }


    public static void main(String[] args){

        //test case
        int n = 11;
        String s = "UDDUUDDUUDD";

        System.out.println(countingValleys(n, s));


    }
}
