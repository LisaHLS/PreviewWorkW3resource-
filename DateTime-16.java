import java.util.*;
public class DateTime-16 {

    public static void main(String[] Strings) {

        Calendar cal = Calendar.getInstance();
        System.out.println("Current Date: " + cal.getTime());

        cal.add(Calendar.DAY_OF_YEAR, 14);
        System.out.println("Day after two weeks: " + cal.getTime());

    }
}