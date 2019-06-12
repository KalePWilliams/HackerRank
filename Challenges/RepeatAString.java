package Challenges;

public class RepeatAString {

    /*  repeatedString method determines the number of occurrences
     *   of the letter 'a' as string s is repeated to n length
     */

    static long repeatedString(String s, long n) {

        long result = 0;
        // find how many times String s is repeated to fill a length of n
        long stringRepetitions = n/s.length();
        long remainder = n%s.length();

        // count the occurrences of 'a' in the String
        for(int i =0; i< s.length(); i++){
            if (s.charAt(i) == 'a'){
                result++;
            }
        }
        // multiply the occurrences of 'a' for each repetition of the String
        result = result * stringRepetitions;

        // add any possible 'a' values in any leftover substring
        for (int i = 0; i<remainder; i++){
            if(s.charAt(i) == 'a'){
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args){

        // test case, result will return 7
        String s = "aba";
        long n = 10;

        System.out.println(repeatedString(s,n));

    }
}

