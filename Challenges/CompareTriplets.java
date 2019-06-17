package Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int aliceScore = 0;
        int bobScore = 0;
        int i = 0;

        do {
            if (a.get(i) > b.get(i)){
                aliceScore++;
            }else if
            (b.get(i) > a.get(i)){
                bobScore++;
            }
            i++;
        }while (i < 3);

        return Arrays.asList(aliceScore, bobScore);
    }

    public static void main(String[] args) {

        //test case
        List<Integer> alice = new ArrayList<Integer>();
        alice.add(1);
        alice.add(3);
        alice.add(5);

        List<Integer> bob = new ArrayList<Integer>();
        bob.add(1);
        bob.add(3);
        bob.add(5);

        System.out.print("Here is the score");
        System.out.println(compareTriplets(alice,bob).toString());

    }

}


