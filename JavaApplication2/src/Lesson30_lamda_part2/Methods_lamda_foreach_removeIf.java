
package Lesson30_lamda_part2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Methods_lamda_foreach_removeIf {
    /**
     * теперь множество классов и интерфейсов коллекций содержат в себе методы которые используют функциональные интерфейсы и теперь
     * программисты могут вызывать эти методы с помощью лямда выражений и множество процессов стали гораздо проще
     * рассмотрим 3 метода:
     */
    
    public static void main(String[] args) {
        List<String> list = List.of("привет", "пока", "как дела?", "все нормально");
        for(String s: list){
            System.out.println(s);
            /**
             * output:
             * привет
               пока
               как дела?
               все нормально
               * 
               * да код не велик, но можно сделать это подругому
             */
            
            list.forEach(s1 -> System.out.println(s1));
            /**
             *  в параметре прописываем что нужно сделать для каждого элемента.Используем лямда выражения
             */
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.removeIf(element -> element%3 == 0 ); // тестирует элементы и удаляет те элементы которые нацело делятся на 3(используется Predicate)
        System.out.println(al); // [1, 2, 4, 5, 7] 3 и 6 удалились
        
        /**
         * другая технология написания:
         * 
         */
        
        Predicate<Integer> p  = element -> element%3 == 0;
        al.removeIf(p); 
        System.out.println(al);
        
        /**
         * результат один и тот же 
         */
        
    }
 
}
