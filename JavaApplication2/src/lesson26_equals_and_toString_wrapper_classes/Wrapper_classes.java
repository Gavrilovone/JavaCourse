
package lesson26_equals_and_toString_wrapper_classes;
import java.util.*;
/** 
 * Wrapper class - это класс обертка, оборачивает в класс примитивне типы данных
 * Autoboxing - это конвертирование примитивных типов данных в соответствующий wrapper класс(или примитивный тип данных в referance)
 * Unboxing - это конвертирование Wrapper класса в соответствующий ему примитивный тип данных
 * 
 * У wrapper классов есть методы:
 * метод parse  - позволяет нам конвертировать подходящее значене типа данных String в соответствующий примитивный тип данных.Этот метод
 * есть у всех wrapper классов, он static, что позволяет нам использовать его не создавая объект wrapper класса
 * 
 * метод velueOF -  позволяет нам создавать новый объект wrapper класса того типа, на котором данный объект был вызван
 * 
 * классы String, StringBuilder, StringBuffer, также все wrapper классы, класс System  - являются final классами и не могут extend-ится
 */
public class Wrapper_classes {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        /**
         * как мы помним мы не можем записать ArrayList<int> так как тип может быть только referance
         */
        list.add(5); 
        /**
         * произошел autoboxing, int 5 конвертировался в объект типа Integer и потом добавился в ArrayList
         */
        
        Long l = 50L; 
        /**
         * произошел autoboxing, long 50 конвертировался в объект типа Long, если убрать L, будет ошибка,потому что int 50 не может автоматически
         * конвертироваться в тип даных Long
         */
        
        int a  = list.get(0); // unboxing
        /** 
         * Переменной примитивного типа данных int примваиваем значение объекта и происходит автораспаковка
         */
        
        Number b =  10; 
        /**
         * произошел unboxing
         * Integer, Short, Long, Double, Float - являются потомками класса Number, поэтому можно записать Number b =  10;  вместо Integer b = 10;
         */
        int с = (int)b;
        
        String s1 = "50";
        String s2 = "true";
        String s3 = "3.14";
        int i1 = Integer.parseInt(s1); 
        /**
         * String "50" конвертировался в int 50(" 50") парсить не можем, потому что пробел 50 не может быть int
         */
        boolean b2 = Boolean.parseBoolean(s2);
        /**
         * у Boolean parse немного по другому работает, все что кроме true, например "fhvbTrue" будет восприниматься ка false 
         */
        double d3 = Double.parseDouble(s3);
        
        System.out.println(i1); // 50
        System.out.println(b2); // true
        System.out.println(d3); // 3.14
        
        Integer i2 = Integer.valueOf(10);
        System.out.println(i2); // 10
        
        
       
}
   }
