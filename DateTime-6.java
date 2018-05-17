import java.util.*;
import java.text.SimpleDateFormat;
public class DateTime-6 {

    public static void main(String[] Strings) {

        Calendar cal = Calendar.getInstance();
        System.out.println("Current full date and time is : " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime()));
    }
}