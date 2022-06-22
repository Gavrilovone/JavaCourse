
package lesson_29_dates_and_times;
import java.time.*;
    /**
     * getDayOfWeek() --> DayOfWeek чтобы получить информацию о дне неделе
     * getDayOfMonth() --> int чтобы получить информацию одне месяца
     * getDayOfYear() --> int чтобы получить информацию о дне года
     * getMonth() --> Month , чтобы получить информацию о месяцу, возвращает enum типа Month, тоеть его имя
     * getMonthValue() --> int, чтобы получить информацию о порядковом номере месяца
     * getYearValue() --> int, чтобы получить информацию о годе
     */
public class Get_Information_from_LocalDate_class {
    
}
 class Test6{
     public static void main(String[] args) {
         LocalDate ld = LocalDate.of(2022, Month.MARCH, 1);
         LocalDateTime ldt = LocalDateTime.of(2022, Month.JUNE, 21, 16, 40);
         System.out.println(ld.getDayOfWeek());  // TUESDAY
         System.out.println(ldt.getDayOfWeek()); // TUESDAY
         System.out.println(ld.getDayOfMonth()); // 1
         System.out.println(ldt.getDayOfMonth());// 21
         System.out.println(ldt.getDayOfYear());// 172 - 21t июня это 172 день года
         System.out.println(ld.getMonth()); // MARCH
         System.out.println(ld.getMonthValue()); // 3
         System.out.println(ld.getYear()); // 2022
     }
 }