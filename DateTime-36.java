import java.util.*;
import java.text.*;
public class DateTime-36 {

    public static void main(String[] Strings) {

        long unix_seconds = 1372339860;
        Date date = new Date(unix_seconds*1000L);
        SimpleDateFormat jdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        jdf.setTimeZone(TimeZone.getTimeZone("GMT-4"));

        System.out.println(jdf.format(date));
    }
}