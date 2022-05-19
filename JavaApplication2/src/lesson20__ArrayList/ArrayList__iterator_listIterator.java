package lesson20__ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList__iterator_listIterator {

    public static void main(String[] args) {

        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);
        
        Iterator <String> it = list1.iterator(); // если импортировать import java.util.Iterator; то можно проитерировать наш лист с помощью метода iterator(). Итератор, значит повторитель
        while(it.hasNext()){ // если есть следующий элемент 
            System.out.print(it.next()); // С A D B   мы будем выводить следующий 
            
            // метод hasNext смотрит есть ли еще элемент, а метод next выдает этот элемент
            // можно встретить  Iterator <String> it = list1.iterator(); 
            
            // отличие от foreach в том, что с помощью итератора можно например удалить элемент листа
            
            while(it.hasNext()){
               it.next();
               it.remove();
                System.out.println(it.hasNext());
            }
        
        } 
    }
}
