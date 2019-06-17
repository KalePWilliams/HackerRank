package Challenges;

public class Staircase {
    static void staircase(int n) {
        int num = n;

        for (int i = 0; i < num; i++){
            for(int h = 0; h < num ;h++){
                if((i+h+2)> num ){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

        //test case
        int num = 4;
        staircase(num);
    }
}
