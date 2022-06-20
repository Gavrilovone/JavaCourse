package lesson_29_dates_and_times;

import java.time.*;
/**
 * объекты классов LocalDate, LocalTime, LocalDateTime являются immutable,  тоесть если мы будем применять определенные методы, сами они меняться не будут
 * все их методы возвращают соответствующие объекты в return type
 * 
 * методы LocalDateTime охватывают методы LocalDate и LocalTime и возвращают тип LocalDateTime
 */
public class Change_object_LocalTime_and_Date {

    public static void main(String[] args) {

        LocalDate ld1 = LocalDate.of(2022, 6, 18);
        System.out.println(ld1); // 2022-06-18

        LocalTime lt1 = LocalTime.of(8, 20);
        System.out.println(lt1); // 08:20

        LocalDateTime ldt1 = LocalDateTime.of(2022, 6, 20, 5, 28);
        System.out.println(ldt1); // 2022-06-20T05:28

    }

}
