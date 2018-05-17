import java.util.*;
import java.text.SimpleDateFormat;
public class DateTime-5 {

    public static void main(String[] Strings) {

        Calendar calNewYork = Calendar.getInstance();
        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Time in New York: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calNewYork.getTime()));
    }
}