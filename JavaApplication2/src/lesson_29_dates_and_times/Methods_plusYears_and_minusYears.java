package lesson_29_dates_and_times;

import java.time.LocalDate;
/**
 * Метод plusYears(long количество_лет) --> LocalDate
 * Метод minusYears(long количество_лет) --> LocalDate
 */
public class Methods_plusYears_and_minusYears {

    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2022, 6, 18);
        System.out.println(ld1); // 2022-06-18
        ld1 = ld1.plusYears(2);
        System.out.println(ld1);// 2024-06-18
        ld1 = ld1.minusYears(3);
        System.out.println(ld1); // 2021-06-18
    }
}
