import java.util.*;
public class DateTime-17 {

    public static void main(String[] Strings) {

        Calendar cal = Calendar.getInstance();
        System.out.println("Current Date : " + cal.getTime());

        cal.add(Calendar.YEAR, 1);
        System.out.println("Date after 1 year : " + cal.getTime());

        cal.add(Calendar.YEAR, -2);
        System.out.println("Date before 1 year : " + cal.getTime());

    }
}