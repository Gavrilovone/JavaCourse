
package lesson_29_dates_and_times;
import java.time.*;
import java.time.format.*;
/**
 * С помощью метода ofPattern  - мы можем создать свой формат
 */
public class Method_ofPattern {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2022, Month.MARCH, 1);
        LocalTime lt = LocalTime.of(5, 40);
        LocalDateTime ldt = LocalDateTime.of(2022, Month.JUNE, 21, 16, 40);
        
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM, dd, yyy, hh:mm"); // в параметрах мы указываем совой формат(знаки припенания для красоты)
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd MMMM yyy hh:mm"); // можно менять местами
        /**
         * LocalDateTime ldt = LocalDateTime(2022, Month.MARCH, 10, 15, 20, 30, 5555);
         * 
         * "Y" = 2014  "YY" = 14  "YYYY" = 2014
         * "M" = 3     "MM" = 03  "MMM" = мар   "MMMM" = марта
         * "w" = 11    "ww"= 11
         * "d" = 10    "dd"= 10
         * "h" = 3     "hh"= 03
         * "m" = 20    "mm"= 20
         * "s" = 30    "ss"= 30
         * "n" = 11    "nnnnn"= 05555
         * 
         */
        
        System.out.println(ldt); // 2022-06-21T16:40
        System.out.println(ldt.format(f)); // июня, 21, 2022, 04:40
        System.out.println(ldt.format(f1)); // 21 июня 2022 04:40
    }
}
