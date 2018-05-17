import java.util.*;
import java.time.*;
import java.text.*;
public class DateTime-12 {

    public static void main(String[] Strings) {

        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("de"));
        String[] dayNames = symbols.getWeekdays();
        for (String s : dayNames) {
            System.out.print(s + "\n");
        }
    }
}