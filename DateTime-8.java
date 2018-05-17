import java.util.*;
import java.text.SimpleDateFormat;
public class DateTime-8 {

    public static void main(String[] Strings) {

        Calendar cal = Calendar.getInstance();
        System.out.println("Current date is : " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime()));
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("Last date is : " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime()));
    }
}