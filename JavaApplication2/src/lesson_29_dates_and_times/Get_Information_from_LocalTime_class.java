
package lesson_29_dates_and_times;
import java.time.*;
/**
 * getNano() --> int
 * getSecond() --> int
 * getMinute() --> int
 * getHour() --> int
 */
public class Get_Information_from_LocalTime_class {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(5, 40);
        System.out.println(lt.getNano()); // 0 потому что нет наносекунд
        System.out.println(lt.getSecond()); // 0
        System.out.println(lt.getMinute()); // 40
        System.out.println(lt.getHour()); // 5
    }
}
