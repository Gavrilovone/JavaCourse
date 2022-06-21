
package lesson_29_dates_and_times;
import java.time.*;
public class Example {
    
}
/**
 * Допустим в школе решили, что каждый месяц будет меняться дежурный по классу
 */
class Test4{
    static void changeDuty(LocalDate start, LocalDate theEnd){
        LocalDate date = start;
        while(date.isBefore(theEnd)){ // конец учбного года
            System.out.println("the date has come " + date + " it's time to change the attendant");
            date = date.plusMonths(1); // каждый месяц меняется месяц, тоесть дужурный
        }
    }
    
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2022, Month.SEPTEMBER, 1);
        LocalDate theEnd = LocalDate.of(2023, Month.MAY, 31);
        changeDuty(start, theEnd);
    }
    
  
}
/** output:
 *  the date has come 2022-09-01 it's time to change the attendant
    the date has come 2022-10-01 it's time to change the attendant
    the date has come 2022-11-01 it's time to change the attendant
    the date has come 2022-12-01 it's time to change the attendant
    the date has come 2023-01-01 it's time to change the attendant
    the date has come 2023-02-01 it's time to change the attendant
    the date has come 2023-03-01 it's time to change the attendant
    the date has come 2023-04-01 it's time to change the attendant
    the date has come 2023-05-01 it's time to change the attendant
 */

  /**
     * Этот метод плох тем, что если мы захотим менять дежурного раз в неделю например, его надо будет полностью переделывать, чтобы менять
     * вызов(параметр) метода а не сам весь метод, есть такой класс Period см.Example2_with_period
     */