package lesson30_lamda_expression;

import java.util.ArrayList;

public class Example_3_lamda {
}

class Student {

    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;

    }

}

interface StudentChecks {
    /**
     * интерфейс который имеет лишь один метод, называется функциональным интерфейсом он меет лишь один абстрактный метод, но в нем
     * может быть сколько угодно дефолтных и статик методов.И если в нем всего один абстрактный метод и есть еще дефолтные и статик,
     * он по прежнему считается функциональным
     */

    boolean test(Student s);
}

class StudentInfo {

    void printStudent(Student st) {
        System.out.println("Имя студента: " + st.name + ", пол: " + st.sex + ", возраст: " + st.age + ", курс: " + st.course + ", средняя оценка: " + st.avgGrade);
    }

    void testStudents(ArrayList<Student> aL, StudentChecks sc) {
/**
 *  Метод testStudents по прежнему для каждого студента из ArrayList-a  aL проверяет: этот студент подходит под условие фильтрации объекта sc типа StudentChecks
 * используя метод test, то-есть если  if (sc.test(s)) - true,  то выводит на экран студента, если нет, то нет
 */
        for (Student s : aL) {
            if (sc.test(s)) {
                printStudent(s);
            }

        }

    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Иван", 'm', 22, 3, 8.3);
        Student st2 = new Student("Николай", 'm', 28, 2, 6.4);
        Student st3 = new Student("Елена", 'f', 19, 1, 8.9);
        Student st4 = new Student("Петр", 'm', 35, 4, 7);
        Student st5 = new Student("Мария", 'а', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo si = new StudentInfo();
       
/**
 * Использование лямда выражений позволяют нам не создавать классы, которые имплементируют данный интерфейс StudentChecks  и переписывают метод test
 * эта возможность появилась с 8 java,  использование lamda выражений это по сути использование функционального стиля программирования, мы можем
 * думать о лямда выражениях как об анонимных методах,у этого метода есть параметр, есть тело, но нет имени
 */
        System.out.println("-----------------------------------------------------------------------");
        si.testStudents(list, (Student st) -> {return st.avgGrade > 8.5;}); // st можно назвать как угодно
        /**
         * в первых круглых скобках мы указываем какой параметр принимает это метод test, допустим он принял параметр Student st и далее что он
         * должен сделать и тут в фигурных скобках пишем тело этого метода, в данном случае он возвращает boolean от этого сравнения
         * как java понимает, что мы оверадим здесь именно метод test? ответ заключается в том, java позволяет использовать лямда выражения только 
         * если мы работаем с интерфейсом который имеет лишь один метод !!!
         * 
         * как происходит работа этого lamda exspression : java понимает, что чтобы использовать тип этого интерфейса во втором параметре 
         * метода testStudents нужно оверайдить метод test(в прошлом примере Example_2 мы для этого создавали класс, имплементировали интерфейс
         * и оверайдили метод test, создавали объект этого класса и использовали его в качестве второго парметра метода testStudents) и мы оверайдим 
         * его прямо в параметре метода testStudents, это возможно изза того, что метод test всего один
         */
        System.out.println("-----------------------------------------------------------------------");
        si.testStudents(list, st -> {return st.avgGrade < 9;}); // если тип не указываем,то писать без круглых скобок 
        System.out.println("-----------------------------------------------------------------------");
        si.testStudents(list, st -> st.age > 25);// самый короткий вариант написания лямда выражения
        System.out.println("-----------------------------------------------------------------------");
        si.testStudents(list, (Student st) -> {return st.age < 27;});
        System.out.println("-----------------------------------------------------------------------");
        si.testStudents(list, (Student st) -> {return st.sex == 'm';});
        System.out.println("-----------------------------------------------------------------------");
        si.testStudents(list, (Student st) -> {return st.avgGrade > 8.5 && st.age < 23 && st.sex == 'f';});
        // если 2 и более statement то пишем st -> {int a= 5; return st.avgGrade < 9;}); скобки и точка с запятой обязательны
        /** 
         * output будет такой же как в Example_1 и Example_2
         */

    }
}

/**
 * вместо обычного интерфейса с одним методом, можно работать с так называемым интерфесом Predicate
 * 
 * public interface Predicate<T>{ -  один раз прописываем тип данных например Student, Animal
 * boolean test(T t); -  а здесь java автоматически заменяет T  на соответствующий тип  (см.Method_Predicate)
 * }
 * 
 */