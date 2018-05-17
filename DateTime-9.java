import java.util.*;
import java.text.SimpleDateFormat;
public class DateTime-9 {

    public static void main(String[] Strings) {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        System.out.println(new SimpleDateFormat("EEE yyyy-MM-dd").format(c.getTime()));

        c.add(Calendar.DATE, 6);
        System.out.println(new SimpleDateFormat("EEE yyyy-MM-dd").format(c.getTime()));
    }
}