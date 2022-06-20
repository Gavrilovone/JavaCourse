
package lesson_29_dates_and_times;
import java.time.*;
/**
 * Метод plusMonths(long количество_месяцев) --> LocalDate
 * Метод minusMonths(long количество_месяцев) --> LocalDate
 */
public class Methods_plusMonths_and_minusMonths {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2022, 6, 18);
        System.out.println(ld1); // 2022-06-18
        ld1 = ld1.plusMonths(2);
        System.out.println(ld1);// 2022-08-18
        ld1 = ld1.minusMonths(3);
        System.out.println(ld1); // 2022-05-18
    }
}
