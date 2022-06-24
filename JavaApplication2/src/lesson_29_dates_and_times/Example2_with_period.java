
package lesson_29_dates_and_times;
import java.time.*;

public class Example2_with_period {
    static void changeDuty(LocalDate start, LocalDate theEnd, Period p){
        LocalDate date = start;
        while(date.isBefore(theEnd)){ // конец учебного года
            System.out.println("the date has come " + date + " it's time to change the attendant");
            date = date.plus(p); // здесь мы меняем уже не конкретно месяц, а в зависимости от того что это месяц , год неделя или день
        }
    }
    
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2022, Month.SEPTEMBER, 1);
        LocalDate theEnd = LocalDate.of(2023, Month.MAY, 31);
/**
 * класс Period имеет access modifier privet, методы of возвращают объекты типа Period
 * класс Period имеет метод plus, minus и может использоваться для прибавления и отнимания периодов к/от объектов LocaDate, LocalDateTime,
 * но не LocalTime(будет exception ) потому что минимальное его деление это день, меньше дня период не бывает, но если нам необходимы меньшие
 * значения, есть класс Duration(продолжительность), он такой же как Prriod, но с меньшими значениями и включает количество дней, часов,
 * минут, секунд, миллисекунд, нано секунд
 * При создании объекта класса Period не работает метод chaining метода of.при попытке метода chaining только последний метод имеет значение
 * 
 * класс Duration имеет метод plus, minus и может использоваться для прибавления и отнимания периодов к/от объектов LocalTime, LocalDateTime,
 *  но не LocaDate(будет exception )
 * При создании объекта класса Duration не работает метод chaining метода of.при попытке метода chaining только последний метод имеет значение
 */
        Period p = Period.ofWeeks(2); // каждые 2 недели смена дежурного
        /**
         * можно указать Period p = Period.of(1, 3, 15); период  - каждый год, 3 месяца и 15 дней
         */
        changeDuty(start, theEnd, p);
    }
}

/** output:
 *  the date has come 2022-09-01 it's time to change the attendant
    the date has come 2022-09-15 it's time to change the attendant
    the date has come 2022-09-29 it's time to change the attendant
    the date has come 2022-10-13 it's time to change the attendant
    the date has come 2022-10-27 it's time to change the attendant
    the date has come 2022-11-10 it's time to change the attendant
    the date has come 2022-11-24 it's time to change the attendant
    the date has come 2022-12-08 it's time to change the attendant
    the date has come 2022-12-22 it's time to change the attendant
    the date has come 2023-01-05 it's time to change the attendant
    the date has come 2023-01-19 it's time to change the attendant
    the date has come 2023-02-02 it's time to change the attendant
    the date has come 2023-02-16 it's time to change the attendant
    the date has come 2023-03-02 it's time to change the attendant
    the date has come 2023-03-16 it's time to change the attendant
    the date has come 2023-03-30 it's time to change the attendant
    the date has come 2023-04-13 it's time to change the attendant
    the date has come 2023-04-27 it's time to change the attendant
    the date has come 2023-05-11 it's time to change the attendant
    the date has come 2023-05-25 it's time to change the attendant
 */