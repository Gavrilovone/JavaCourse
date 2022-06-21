
package lesson_29_dates_and_times;
import java.time.*;
    /**
     * getDayOfWeek() --> DayOfWeek чтобы получить информацию о дне неделе
     * getDayOfMonth() --> int чтобы получить информацию одне месяца
     */
public class Get_Information_getDayOfWeek {
    
}
 class Test6{
     public static void main(String[] args) {
         LocalDate ld = LocalDate.of(2022, Month.MARCH, 1);
         LocalDateTime ldt = LocalDateTime.of(2022, Month.JUNE, 21, 16, 40);
         System.out.println(ld.getDayOfWeek());  // TUESDAY
         System.out.println(ldt.getDayOfWeek()); // TUESDAY
         System.out.println(ld.getDayOfMonth()); // 1
         System.out.println(ldt.getDayOfMonth());// 21
         
     }
 }