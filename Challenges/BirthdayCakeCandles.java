package Challenges;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar) {
        int countMax = 0;
        int max = 0;

        // find the highest value
        for (int i = 0; i < ar.length; i++){
            if (ar[i] > max){
                max = ar[i];
            }
        }
        // find how many instances of the highest value
        for (int i = 0; i < ar.length; i++){
            if (ar[i] == max){
                countMax++;
            }
        }
        return countMax;

    }

    public static void main(String[] args) {

        //test case
        //the greatest value(s) are 2 nines, therefore 2 will be outputted
        int[] array = {4,4,3,9,9,1,5};

        System.out.println(birthdayCakeCandles(array));
    }



}
