package lesson_29_dates_and_times;

import java.time.*;

/**
 * методы isAfter и isBefore - позволяют сравнивать объекты localDate, Localtime и LocalDateTime, возвращает boolean
 * компилятор позволяет сравнивать только объекты соответствующих классов
 */

public class Methods_isAfter_and_isBefore {

    public static void main(String[] args) {

        LocalDate ld1 = LocalDate.of(2022, 6, 18);
        LocalDate ld2 = LocalDate.of(2020, Month.MARCH, 3);
        System.out.println(ld1.isAfter(ld2)); // true

        LocalTime lt1 = LocalTime.of(8, 20);
        LocalTime lt2 = LocalTime.of(8, 20, 33, 16);
        System.out.println(lt1.isBefore(lt2)); // true

        LocalDateTime ldt1 = LocalDateTime.of(2022, 6, 20, 5, 28);
        LocalDateTime ldt2 = LocalDateTime.of(2022, 6, 20, 5, 28, 9);
        System.out.println(ldt1.isAfter(ldt2));// false
    }
}
