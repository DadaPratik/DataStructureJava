package array;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArrayExamples {


    public static void main(String[] args) {

        String[] DaysWeek = new String[7];
        System.out.println(Arrays.toString(DaysWeek));
        DaysWeek[0] = "Sunday";
        DaysWeek[1] = "Monday";
        DaysWeek[2] = "Tuesday";
        DaysWeek[3] = "Wednesday";
        DaysWeek[4] = "Thursday";
        DaysWeek[5] = "Friday";
        DaysWeek[6] = "Saturday";

        System.out.println(Arrays.toString(DaysWeek));

        var days = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        System.out.println(Arrays.toString(days));
        for (String day : days) {
            System.out.println(day.toUpperCase());
        }


    }


}
