package lesson30_lamda_expression;

import java.util.ArrayList;

public class Example_1 {

}

class Test1 {
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

class StudentInfo {

    void printStudent(Student st) {
        System.out.println("Имя студента: " + st.name + ", пол: " + st.sex + ", возраст: " + st.age + ", курс: " + st.course + ", средняя оценка: " + st.avgGrade);
    }

    /**
     * создаем метод который выводит на экран студентов выше определенной оценки
     */
    void printStudentOverGrade(ArrayList<Student> aL, double avgGrade) {
        for (Student s : aL) { // из списка по одному берутся студенты и проверяется условие
            if (s.avgGrade > avgGrade) {
                printStudent(s);
            }
        }
    }

    /**
     * создаем метод который выводит на экран студентов ниже определенной оценки
     */
    void printStudentUnderGrade(ArrayList<Student> aL, double avgGrade) {
        for (Student s : aL) {
            if (s.avgGrade < avgGrade) {
                printStudent(s);
            }
        }
    }

    /**
     * создаем метод который выводит на экран студентов выше определенного возраста
     */
    void printStudentOverAge(ArrayList<Student> aL, int age) {
        for (Student s : aL) {
            if (s.age > age) {
                printStudent(s);
            }
        }

    }

    /**
     * создаем метод который выводит на экран студентов выше определенного возраста
     */
    void printStudentUnderAge(ArrayList<Student> aL, int age) {
        for (Student s : aL) {
            if (s.age < age) {
                printStudent(s);
            }
        }

    }

    /**
     * создаем метод который фильтрует студентов по полу
     */
    void printStudentBySex(ArrayList<Student> aL, char sex) {
        for (Student s : aL) {
            if (s.sex == sex) { // тоесть если мы ищем только парней или только девушек 
                printStudent(s);
            }
        }

    }

    /**
     * создаем смешанный метод
     */
    void printStudentMixConditions(ArrayList<Student> aL, double avgGrade, int age, char sex) {
        for (Student s : aL) {
            if (s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
                 /**
             * если оценка больше той которой задаем и возраст меньше того которого задаем и пол тот который задаем, то выводим на экран
             */
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
        si.printStudentOverGrade(list, 8.5); // вывести студентов с оценкой больше 8.5
        /** 
         * output:
         * Имя студента: Елена, пол: f, возраст: 19, курс: 1, средняя оценка: 8.9
           Имя студента: Мария, пол: а, возраст: 23, курс: 3, средняя оценка: 9.1
         */
        System.out.println("-----------------------------------------------------------------------");
        
        si.printStudentUnderGrade(list, 9.5); // вывести студентов с оценкой меньше 9.5
        /** 
         * output:
         * Имя студента: Иван, пол: m, возраст: 22, курс: 3, средняя оценка: 8.3
           Имя студента: Николай, пол: m, возраст: 28, курс: 2, средняя оценка: 6.4
           Имя студента: Елена, пол: f, возраст: 19, курс: 1, средняя оценка: 8.9
           Имя студента: Петр, пол: m, возраст: 35, курс: 4, средняя оценка: 7.0
           Имя студента: Мария, пол: а, возраст: 23, курс: 3, средняя оценка: 9.1
         */
        System.out.println("-----------------------------------------------------------------------");
        
        si.printStudentOverAge(list, 25); // вывести студентов старше 25 лет
        /**
         * output:
         * Имя студента: Николай, пол: m, возраст: 28, курс: 2, средняя оценка: 6.4
           Имя студента: Петр, пол: m, возраст: 35, курс: 4, средняя оценка: 7.0
         */
        System.out.println("-----------------------------------------------------------------------");
        
        si.printStudentUnderAge(list, 27); // вывести студентов младше 27 лет
        /**
         * output:
         * Имя студента: Иван, пол: m, возраст: 22, курс: 3, средняя оценка: 8.3
           Имя студента: Елена, пол: f, возраст: 19, курс: 1, средняя оценка: 8.9
           Имя студента: Мария, пол: а, возраст: 23, курс: 3, средняя оценка: 9.1
         */
        System.out.println("-----------------------------------------------------------------------");
        
        si.printStudentBySex(list, 'm');//  вывести всех студентов мужского пола
        /**
         * output:
         * Имя студента: Иван, пол: m, возраст: 22, курс: 3, средняя оценка: 8.3
           Имя студента: Николай, пол: m, возраст: 28, курс: 2, средняя оценка: 6.4
           Имя студента: Петр, пол: m, возраст: 35, курс: 4, средняя оценка: 7.0
         */
        System.out.println("-----------------------------------------------------------------------");
        
        si.printStudentMixConditions(list, 7.2, 23, 'f'); // оценка > 7.2, возраст < 23 и которые девушки
        /**
         * output:
         * Имя студента: Елена, пол: f, возраст: 19, курс: 1, средняя оценка: 8.9
         */
        
        /**
         * Этот пример показывает как сложжно и громоздко получается, так как вариантов фильтрации может быть очень много, и каждый раз это прописывать неудобно(еть вариант как это сделать подругому см.Example_2)
         */
        
        
        
        
    }
}
