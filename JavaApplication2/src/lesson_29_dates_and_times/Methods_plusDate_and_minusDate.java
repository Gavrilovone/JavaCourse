
package lesson_29_dates_and_times;
import java.time.*;
/**
 * Метод plusDate(long количество_дней) --> LocalDate
 * Метод minusDate(long количество_дней) --> LocalDate
 */
public class Methods_plusDate_and_minusDate {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2022, 6, 18);
        System.out.println(ld1); // 2022-06-18
        ld1.plusDays(5);
        System.out.println(ld1); // 2022-06-18 из-за того, что объект immutable, значение не изменилось, но можно сделать так:
        LocalDate ld2 = ld1.plusDays(5);
        System.out.println(ld2);// 2022-06-23
        /**
         * или так:
         */
        ld1 = ld1.plusDays(5);
        System.out.println(ld1);// 2022-06-23
        ld1 = ld1.minusDays(5);
        System.out.println(ld1);// 2022-06-18
        
    }
}

