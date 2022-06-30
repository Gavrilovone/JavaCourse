
package lesson30_lamda_expression;
import java.util.ArrayList;
import java.util.function.*;

public class Method_Predicate {
    
}

class Student4 {

    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student4(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;

    }

}



class StudentInfo4 {

    void printStudent4(Student4 st) {
        System.out.println("Имя студента: " + st.name + ", пол: " + st.sex + ", возраст: " + st.age + ", курс: " + st.course + ", средняя оценка: " + st.avgGrade);
    }

    void testStudents4(ArrayList<Student4> aL, Predicate<Student4> t) {

        for (Student4 s : aL) {
            if (t.test(s)) {
                printStudent4(s);
            }

        }

    }

    public static void main(String[] args) {
        ArrayList<Student4> list4 = new ArrayList<>();
        Student4 st1 = new Student4("Иван", 'm', 22, 3, 8.3);
        Student4 st2 = new Student4("Николай", 'm', 28, 2, 6.4);
        Student4 st3 = new Student4("Елена", 'f', 19, 1, 8.9);
        Student4 st4 = new Student4("Петр", 'm', 35, 4, 7);
        Student4 st5 = new Student4("Мария", 'а', 23, 3, 9.1);
        list4.add(st1);
        list4.add(st2);
        list4.add(st3);
        list4.add(st4);
        list4.add(st5);

        StudentInfo4 si = new StudentInfo4();
       

        System.out.println("-----------------------------------------------------------------------");
        si.testStudents4(list4, (Student4 st) -> {return st.avgGrade > 8.5;}); // st можно назвать как угодно
       
        System.out.println("-----------------------------------------------------------------------");
        si.testStudents4(list4, st -> {return st.avgGrade < 9;}); // если тип не указываем,то писать без круглых скобок 
        System.out.println("-----------------------------------------------------------------------");
        si.testStudents4(list4, st -> st.age > 25);// самый короткий вариант написания лямда выражения
        System.out.println("-----------------------------------------------------------------------");
        si.testStudents4(list4, (Student4 st) -> {return st.age < 27;});
        System.out.println("-----------------------------------------------------------------------");
        si.testStudents4(list4, (Student4 st) -> {return st.sex == 'm';});
        System.out.println("-----------------------------------------------------------------------");
        si.testStudents4(list4, (Student4 st) -> {return st.avgGrade > 8.5 && st.age < 23 && st.sex == 'f';});
    

    }
}
/**
 * output тот же самый, тоесть метод Predicate<T> нужен нам только для того, чтобы  не создавать свой интерфейс с одним методом, а использовать уже готовый:
 * 
 * public interface Predicate<T>{
 * boolean test(T t);
 * }
 * 
 * Java поместила метод Predicate<T>  в некоторые классы, в частности Метод класса ArrayList removeIf использует в параметре Predicate<T> (см.Example_5)
 */
