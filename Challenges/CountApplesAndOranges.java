package Challenges;

public class CountApplesAndOranges {

    /*  s thru t is the house
    a is the apple tree
    b is the orange tree
    then two arrays containing the values of where the apples and oranges fell on an x axis
    relative to their tree of origin
    see how many apples and oranges struck the house
* */
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int appleHit = 0;
        int orangeHit = 0;

        //determine apple hits
        // the apple tree is to the left of the house, therefore apples
        // that fall to the right (positive) may hit the house
        for (int i = 0; i < apples.length;i++){
            if (apples[i] >= (s-a) && apples[i] <= (t-a)){
                appleHit++;
            }
        }
        //determine orange hits
        //the orange tree is to the right of the house, therefore oranges
        // that fall to the left (negative) may hit the house
        for (int i = 0; i < oranges.length;i++){
            if (oranges[i] <= (t-b) && oranges[i] >= (s-b)) {
                orangeHit++;
            }
        }
        System.out.println(appleHit);
        System.out.println(orangeHit);
    }

    public static void main(String[] args) {

        //test case
        int[] apples = {-2,2,1,3};
        int[] oranges = {2,-6,-10,-4};

        countApplesAndOranges(7, 11,5,15,apples,oranges);
    }
}


