
package lesson30_lamda_expression;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Example_5_predicate_removeIf {
     public static void main(String[] args) {
        ArrayList<Student5> list5= new ArrayList<>();
        Student5 st1 = new Student5("Иван", 'm', 22, 3, 8.3);
        Student5 st2 = new Student5("Николай", 'm', 28, 2, 6.4);
        Student5 st3 = new Student5("Елена", 'f', 19, 1, 8.9);
        Student5 st4 = new Student5("Петр", 'm', 35, 4, 7);
        Student5 st5 = new Student5("Мария", 'а', 23, 3, 9.1);
        list5.add(st1);
        list5.add(st2);
        list5.add(st3);
        list5.add(st4);
        list5.add(st5);
        for(Student5 s: list5){
            System.out.println(s.name);
        }
         System.out.println("----------------------------------");
         /** 
          * допустим мы хотим удалить студентов, если их имена заканчиваются на А, если нам нужно удалить в ArrayList по какой-то логике, тогда мы используем
          * метод removeif
          */
         list5.removeIf(x -> x.name.endsWith("а")); // если это будет true,  то элемент будет удален
         /**
          * x - это параметр типа Student5
          */
          for(Student5 s: list5){
            System.out.println(s.name);
        }
          /**
           * output:
           *         Иван
                     Николай
                     Елена
                     Петр
                     Мария
                     ----------------------------------
                     Иван
                     Николай
                     Петр
                     Мария
           */
         
                    
    }
    
}

class Student5 {

    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student5(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;

    }

}



   
