package Challenges;

public class UtopianTreeAlt {

    static int utopianTree(int n){

        int treeHeight = 1;


        for (int i = 1; i <= n; i++){
            if (i % 2 == 1){
                treeHeight = (treeHeight*2);
            } else {
                treeHeight++;
            }

        }
        return treeHeight;
    }

    public static void main(String[] args){


        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11};

        for(int i = 0; i < arr.length; i++){
            int n = arr[i];



            System.out.println(utopianTree(n));
        }

    }
}
