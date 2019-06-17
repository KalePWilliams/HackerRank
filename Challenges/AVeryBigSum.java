package Challenges;

public class AVeryBigSum {
    static long aVeryBigSum(long[] ar) {
        long sum = 0;

        for (int i = 0; i < ar.length; i++){
            sum = sum + ar[i];
        }
        return sum;
    }
    public static void main(String[] args) {

        //test case
        long ar[] = {10000002,20000002,3000003,4000004,500000005};

        System.out.println(aVeryBigSum(ar));
    }

}
