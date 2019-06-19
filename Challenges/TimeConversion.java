package Challenges;

//Given a time in -hour AM/PM format, convert it to military (24-hour) time
public class TimeConversion {

    static String timeConversion(String s) {

        Integer hour = Integer.valueOf(s.substring(0, 2));
        String amOrPm = s.substring(8);

        //1:00AM - 11:00AM can simply be printed without the "AM" therefore
        //that time-frame does not need to be captured in the conditions
        if (hour < 12 && amOrPm.equalsIgnoreCase("PM")) {
            hour = hour + 12;

        } else if (hour == 12 && amOrPm.equalsIgnoreCase("AM")) {
            hour = 00;
        }
        //This formatting ensures the width of the first field will be 2
        String militaryTime = String.format("%02d",hour).concat(s.substring(2, 8));
        return militaryTime;
    }

    public static void main(String[] args) {

        //test case
        String time = "07:05:45AM";
        System.out.println(timeConversion(time));

    }

}
