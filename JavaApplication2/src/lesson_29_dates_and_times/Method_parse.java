
package lesson_29_dates_and_times;
import java.time.*;
import java.time.format.*;
/**
 * Метод parse переводит String в объект классов LocalDate, LocalTime, LocalDateTime, тоесть противоположен методу format
 */
public class Method_parse {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2022, Month.MARCH, 1);
        LocalTime lt = LocalTime.of(5, 40);
        LocalDateTime ldt = LocalDateTime.of(2022, Month.JUNE, 21, 16, 40);
        
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date1 = LocalDate.parse("06 22 2022", f); // в параметрах должно быть так же как и "MM dd yyyy"
        System.out.println(date1); // 2022-06-22 - дефолтный вид
        LocalDate date2 = LocalDate.parse("2022-06-22"); // если сразу прописать дефолтный вид, то f  формат не нужен
        System.out.println(date2); // 2022-06-22
    }
}
