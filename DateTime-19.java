import java.time.*;
public class DateTime-19 {

    public static void main(String[] Strings) {

        LocalDate today = LocalDate.now();
        LocalDate oldday = LocalDate.of(2017, Month.MAY, 15);
        Period diff = Period.between(oldday, today);
        System.out.println("Difference between "+ oldday +" and "+ today +": "
        + diff.getYears() +" years and "+ diff.getMonths() +" months");

    }
}