package Challenges;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        long min = arr[0];
        long max = arr[0];
        long sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];

            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        long smallest = sum-max;
        long biggest = sum-min;
        System.out.println(smallest+" "+biggest);

    }

    public static void main(String[] args) {
        //sum them all then subtract lowest and highest

        int[] numbers = {3,3,3,5,3};
        miniMaxSum(numbers);

    }


}
