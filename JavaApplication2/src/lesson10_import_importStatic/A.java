/*
    - Для импорта необходимо, чтобы класс и переменные были public
    - такие классы как System, String  импортируются по умолчанию и нет необходимости писать для них
    полное имя java.lang.String
  

 */
package lesson10_import_importStatic;
//import lesson5.Car4;  
//import lesson5.Human;
import lesson5_creat_objects_constructor.Human; // звездочка означает , что импортируется весь пакет(но не подпакет, нужно будет писать так:import lesson5.lesson5_1*; ) и не нужно импортировать классы отдельно
import lesson5_creat_objects_constructor.Car4;
/* Если в пакетах есть классы с одинаковыми именами, то в независимости от звездочки нужно использовать 
   полное имя. но при этом импортировать отдельные классы из разных пакетов, но с одинаковыми именами нельзя
   пример: import lesson5.Car4
           import lesson8.Car4 будет ошибка
*/  

public class A {
    public static void main(String[] args) {
      lesson5_creat_objects_constructor.Car4 c1 = new lesson5_creat_objects_constructor.Car4("Зеленый", "V8", 60); // если не импортировать
      Car4 c2 = new Car4("Красный", "V6", 60);
      Human h1 = new Human();
    }
/*
    для импорта статичной переменно например из пакета: package p2;
                                                      public class B{
                                                      public static int a;
                                                      }
    необходимо указать путь к ней : import static p2.B.a;
    после этого ее можно использовать не прописывая полное имя
    запись import static p2.B*; означает,что все статичные переменные класса В импортированы
    так же можно импортировать статичный метод
    
*/    
    
    
    
}




