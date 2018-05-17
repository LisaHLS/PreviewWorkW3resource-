import java.util.*;
public class DateTime-4 {

    public static void main(String[] Strings) {

        Calendar cal = Calendar.getInstance();
        System.out.println("Current Date and Time:" + cal.getTime());
        int actualMinYear = cal.getActualMinimum(Calendar.YEAR);
        int actualMinMonth = cal.getActualMinimum(Calendar.MONTH);
        int actualMinWeek = cal.getActualMinimum(Calendar.WEEK_OF_YEAR);
        int actualMinDate = cal.getActualMinimum(Calendar.DATE);

        System.out.println("Actual Minimum Year: "+actualMinYear);
        System.out.println("Actual Minimum Month: "+actualMinMonth);
        System.out.println("Actual Minimum Week of Year: "+actualMinWeek);
        System.out.println("Actual Minimum Date: "+actualMinDate);
    }
}