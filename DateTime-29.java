import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
public class DateTime-29 {

    public static void main(String[] Strings) {

        String string = "May 17, 2018";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);
        System.out.println(date);

    }
}