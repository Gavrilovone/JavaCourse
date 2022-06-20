
package lesson_29_dates_and_times;
/**
 * LocalDate - содержит информацию о дне: год, месяц, день
 * LocalTime - содержит информацию о времени: час, минута, сеунда, наносекунда
 * LocalDateTime - объеденяет инфорсацию о дне и времени, содержит: год, месяц, день, час, минута, сеунда, наносекунда
 * данные 3 класса имеют статичский метод now() который который возвращает соответствующие объекты с текущими значениями
 */
import java.time.*;
public class Dates_classes {
    
}
class Test1{
    public static void main(String[] args) {
        System.out.println(LocalDate.now()); // 2022-06-18
        System.out.println(LocalTime.now()); // 07:29:44.997942900
        System.out.println(LocalDateTime.now()); // 2022-06-18T07:29:44.997942900 (буква"Т" разграничивает день и время)
        
    }
}
