
package lesson_29_dates_and_times;
import java.time.*;
public class Create_object_localTime_date {
    public static void main(String[] args) {
        /**
         * LocalDate ld = new LocalDate(2022, 6, 18); - так писать нельзя, потому что LocalDate имеет private конструктор, тоесть
         * нельзя создать объекты классов LocalDate, LocalTime, LocalDateTime с помощью конструктора, но мы можем создать их с помощью метода
         * покажем это на примере класса Car:
         */
         class Car{
             private Car(){};
             /**
              * мы можем создать статический метод:
              */
             static Car createCar(){
                 return new Car(); // этот метод в других классах теперь можно использовать вместо конструктора Car
             }
             /**
              * public static void main(String[] args){
              *     Car с = Car.createCar(); - это выражение будет возвращать нам новый объект класса Car
              * }
              */
             
         }
         
         /**
          * Mетоды of возвращают объект соответствующего типа:
          * public static LocalDate of( int год, int месяц, int день_месяца)
          * public static LocalDate of( int год, Month месяц, int день_месяца) где Month enumeration(перечисление) 
          */
         
         LocalDate ld1 = LocalDate.of(2022, 6, 18);
         System.out.println(ld1); // 2022-06-18
         LocalDate ld2 = LocalDate.of(2022, Month.JUNE, 18);
         System.out.println(ld2); // 2022-06-18
         
         /**
          * методы of для LocalTime:
          * public static LocalTime of( int час, int минута)
          * public static LocalTime of( int час, int минута, int секунда)
          * public static LocalTime of( int час, int минута, int секунда, int наносекунда)
          */
         
         LocalTime lt1 = LocalTime.of(8, 20);
         System.out.println(lt1); // 08:20
         
         LocalTime lt2 = LocalTime.of(8, 20, 55);
         System.out.println(lt2); // 08:20:55
         
          LocalTime lt3 = LocalTime.of(8, 20, 55, 999999999);
          System.out.println(lt3); // 08:20:55.999999999 (миллиардная доля секунды)
          
          /**
           * методы of для LocalDateTime:
           * public static LocalTime of(int год, int месяц int день,_месяца int час, int минута)
           */
         
          
          
    }
}
 