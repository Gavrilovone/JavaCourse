
package lesson_29_dates_and_times;
import java.time.*;
import java.time.format.*;
/**
 * очень много нужно проделать работы, с методами , чтобы на самом деле сделать маленькую часть.В java есть класс который DateTimeFormatter
 * который помогает нам отображать даты и время  более удобном для нас виде
 * данный класс находится в пакете java.time.format
 * с помощью метода format можно изменять вывод даты и времени на экран
 * очень очень редко это может понадобится
 */

public class DateTimeFormatter_class {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2022, Month.MARCH, 1);
        LocalTime lt = LocalTime.of(5, 40);
        LocalDateTime ldt = LocalDateTime.of(2022, Month.JUNE, 21, 16, 40);
        
        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE; // мы создали объект DateTimeFormatter определенного формата
        System.out.println(ld); // 2022-03-01
        System.out.println(ld.format(d1)); // 2022-03-01
        
        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(lt); // 05:40
        System.out.println(lt.format(d2)); // 05:40:00
        
        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(ldt); // 2022-06-21T16:40
        System.out.println(ldt.format(d3)); // 2022-06-21T16:40:00
        System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // 2022-06-21T16:40:00
        
        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        /**
         *  это enum в котором есть константы в частности SHORT, таким образом мы можем изменить дату в удобный короткий вид
         */
        System.out.println(ld); // 2022-03-01
        System.out.println(ld.format(shortFormat)); // 01.03.2022
        System.out.println(shortFormat.format(ld)); // 01.03.2022
        
        DateTimeFormatter shortFormat2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(ldt); // 2022-06-21T16:40
        System.out.println(ldt.format(shortFormat2)); // 21.06.2022, 16:40
    }
}
