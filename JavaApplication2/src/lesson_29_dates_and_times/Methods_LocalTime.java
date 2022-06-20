
package lesson_29_dates_and_times;

import java.time.*;
/**
 * Метод plusHours(long количество_часов) --> LocalDate
 * Метод minusHours(long количество_часов) --> LocalDate
 * Метод plusMinutes(long количество_минут) --> LocalDate
 * Метод minusMinutes(long количество_минут) --> LocalDate
 * Метод plusSeconds(long количество_секунд) --> LocalDate
 * Метод minusSeconds(long количество_секунд) --> LocalDate
 * Метод plusNanos(long количество_наносекунд) --> LocalDate
 * Метод minusNanos(long количество_наносекунд) --> LocalDate
 */
public class Methods_LocalTime {
    public static void main(String[] args) {
        LocalTime lt1 = LocalTime.of(8, 20);
        System.out.println(lt1); // 08:20
        lt1 = lt1.plusHours(2);
        System.out.println(lt1); // 10:20
        lt1 = lt1.minusHours(3);
        System.out.println(lt1); // 07:20
        lt1 = lt1.plusMinutes(15);
        System.out.println(lt1); // 07:35
        lt1 = lt1.minusMinutes(20);
        System.out.println(lt1); // 07:15
        lt1 = lt1.plusSeconds(20);
        System.out.println(lt1); // 07:15:20
        lt1 = lt1.minusSeconds(30);
        System.out.println(lt1); // 07:14:50
        lt1 = lt1.plusNanos(200);
        System.out.println(lt1); // 07:14:50.000000200
        lt1 = lt1.minusNanos(300);
        System.out.println(lt1); // 07:14:49.999999900
        /**
         * можно так же записать все это в метод chainig:
         */
        lt1 = lt1.plusNanos(300).minusNanos(200).plusMinutes(30).minusSeconds(20).minusMinutes(15).plusMinutes(20).minusHours(2).plusHours(3);
        System.out.println(lt1); // 08:49:30
        
        
        
    }
}
