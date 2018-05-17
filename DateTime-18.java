import java.util.*;
public class DateTime-18 {

    public static void main(String[] Strings) {

        int year = 2016;

        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println("Year " + year + " is a leap year");
        else
            System.out.println("Year " + year + " is not a leap year");

    }
}