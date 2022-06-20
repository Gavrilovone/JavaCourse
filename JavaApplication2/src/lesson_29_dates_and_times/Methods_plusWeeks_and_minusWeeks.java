
package lesson_29_dates_and_times;
import java.time.*;
/**
 * Метод plusWeeks(long количество_недель) --> LocalDate
 * Метод minusWeeks(long количество_недель) --> LocalDate
 */
public class Methods_plusWeeks_and_minusWeeks {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2022, 6, 18);
        System.out.println(ld1); // 2022-06-18
        ld1 = ld1.plusWeeks(5);
        System.out.println(ld1);// 2022-07-23
        ld1 = ld1.minusWeeks(5);
        System.out.println(ld1); // 2022-06-18
    }
}
