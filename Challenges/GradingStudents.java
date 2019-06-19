package Challenges;

public class GradingStudents {

    /*A grade below 40 is a failing grade, to be rounded up must be within
    * 2 of the next multiple of 5, therefore 37 and down will not be rounded
    * at all. Only numbers 38 and above and within 2 of the next multiple of
    * 5 will be rounded up to that next multiple. For loop to add grades to
    * the array if grade % 5 > 2 round grade up to next multiple of 5 divide
    * by 5 drop the remainder add 1 to result and multiply by 5*/

    static int[] gradingStudents(int[] grades){

        int[] roundedGrades = new int[grades.length];

        for (int i = 0; i < grades.length; i++){

            if (grades[i] > 37 && grades[i] % 5 >2){
                int j = (grades[i]/5);
                j++;
                roundedGrades[i] = (j*5);
            }else{
                roundedGrades[i] = grades[i];
            }
        }
        return roundedGrades;
    }


    public static void main(String[] args) {

        //test case
        int[] grades = {73,67,38,33};

        int [] newGrades = (gradingStudents(grades));

        for (int i = 0; i < grades.length; i++)
            System.out.println(newGrades[i]);

    }

}
