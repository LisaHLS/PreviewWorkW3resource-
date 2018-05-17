import java.time.*;
public class DateTime-25 {

    public static void main(String[] Strings) {

        Year yr = Year.now();
        System.out.println("Current Year: " + yr);
        boolean isLeap = yr.isLeap();
        System.out.println("Is current year leap year? " + isLeap);
        int length = yr.length();
        System.out.println("Length of the year: " + length+" days");

    }
}