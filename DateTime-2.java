import java.util.*;
import java.text.SimpleDateFormat;
public class DateTime-2 {

    public static void main(String[] Strings) {

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(cal.getTime()));
    }
}