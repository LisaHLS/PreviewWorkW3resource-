import java.util.*;
public class DateTime-11 {

    public static void main(String[] Strings) {

        Calendar cal = Calendar.getInstance();
        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("Number of days of the current month : " + days);
    }
}