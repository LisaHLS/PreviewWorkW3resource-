import java.util.*;
import java.text.SimpleDateFormat;
public class DateTime-1 {

    public static void main(String[] Strings) {

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());

        cal.clear();
        cal.set(2018, 4, 17, 10, 11);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(cal.getTime()));
    }
}