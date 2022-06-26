package lesson30_lamda_expression;

import java.util.ArrayList;

public class Example_2 {
}

class Test2 {
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

/**
 * создадим интерфейс, который будет содержать только один абстрактный метод
 */
interface StudentChecks {

    boolean testStudent(Student s);
}

class FindStudentOverGrade implements StudentChecks {

    @Override
    public boolean testStudent(Student s) {
        return s.avgGrade > 8.5;
    }
}

class StudentInfo {

    void printStudent(Student st) {
        System.out.println("Имя студента: " + st.name + ", пол: " + st.sex + ", возраст: " + st.age + ", курс: " + st.course + ", средняя оценка: " + st.avgGrade);
    }
    
    void testStudents(ArrayList<Student> aL, StudentChecks sc ){
        /**
         * то-есть в параметр вмето sc можно вставить объект любого класса который имплементрирует интерфейс StudentChecks 
         */
        for(Student s: aL){
            if(sc.testStudent(s)){ 
                printStudent(s);
            }
            /**
             * используя метод testStudent объекта этого типа StudentChecks а тип это интерфейс ( а у объектов этого типа метод testStudent всегда есть, 
             * потому что он имплементирует интерфейс StudentChecks и должен оверайдить метод testStude) по-этому мы вызываем на sc метод testStudent и 
             * помещаем в этот метод этого студентаs которого мы перебираем в цикле из списка
             * 
             * таким образом, если мы в параметре(StudentChecks sc) используем объект класса FindStudentOverGrade и если условие sc.testStudent(s) - true 
             * тоесть s.avgGrade > 8.5; то выводи на экран этого студента
             * И если мы будем использовать в параметре другой объект какого-то класса который имплементирует StudentChecks инетерфейс, то в зависимости 
             * от того как он перезаписал метод testStudent,  так и будет исполнена фильтрация в данном примере
             */
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
        FindStudentOverGrade fsog = new FindStudentOverGrade();
        si.testStudents(list, fsog);
        /**
         * output:
         * Имя студента: Елена, пол: f, возраст: 19, курс: 1, средняя оценка: 8.9
           Имя студента: Мария, пол: а, возраст: 23, курс: 3, средняя оценка: 9.1
           * 
           * чем плох данный способ, тем что здесь в условии  return s.avgGrade > 8.5; нужно указывать конкретно например больit какой оценки
           * должен иметь студент, чтобы вывести на кран информацию о нем
         */
        
        /**
         * добавим еще классы которы еимплементируют это  интерфейс
         */
        
        class FindStudentUnderGrade implements StudentChecks {

            @Override
            public boolean testStudent(Student s) {
                return s.avgGrade < 9;
           }
       }
        
           class FindStudentOverAge implements StudentChecks {

            @Override
            public boolean testStudent(Student s) {
                return s.age > 25;
           }
       }
           
           class FindStudentUnderAge implements StudentChecks {

            @Override
            public boolean testStudent(Student s) {
                return s.age < 27;
           }
       }
           
           class FindStudentBySex implements StudentChecks {

            @Override
            public boolean testStudent(Student s) {
                return s.sex == 'm'; //  конткретно должны указывать какой пол мы ищем
           }
       }
           
           class FindStudentMixCondition implements StudentChecks {

            @Override
            public boolean testStudent(Student s) {
                return (s.avgGrade > 7.2 && s.age < 23 && s.sex == 'f' );
           }
       }
           
           
           FindStudentUnderGrade fsug = new FindStudentUnderGrade();
           FindStudentOverAge fsoa = new FindStudentOverAge();
           FindStudentUnderAge fsua = new FindStudentUnderAge();
           FindStudentBySex fsbs = new FindStudentBySex();
           FindStudentMixCondition fsms = new FindStudentMixCondition();
           
           System.out.println("-----------------------------------------------------------------------");
           si.testStudents(list, fsug);
           System.out.println("-----------------------------------------------------------------------");
           si.testStudents(list, fsoa);
           System.out.println("-----------------------------------------------------------------------");
           si.testStudents(list, fsua);
           System.out.println("-----------------------------------------------------------------------");
           si.testStudents(list, fsbs);
           System.out.println("-----------------------------------------------------------------------");
           si.testStudents(list, fsms);
           
           /**
            * output:
            * Имя студента: Иван, пол: m, возраст: 22, курс: 3, средняя оценка: 8.3
              Имя студента: Николай, пол: m, возраст: 28, курс: 2, средняя оценка: 6.4
              Имя студента: Елена, пол: f, возраст: 19, курс: 1, средняя оценка: 8.9
              Имя студента: Петр, пол: m, возраст: 35, курс: 4, средняя оценка: 7.0
              -----------------------------------------------------------------------
              Имя студента: Николай, пол: m, возраст: 28, курс: 2, средняя оценка: 6.4
              Имя студента: Петр, пол: m, возраст: 35, курс: 4, средняя оценка: 7.0
              -----------------------------------------------------------------------
              Имя студента: Иван, пол: m, возраст: 22, курс: 3, средняя оценка: 8.3
              Имя студента: Елена, пол: f, возраст: 19, курс: 1, средняя оценка: 8.9
              Имя студента: Мария, пол: а, возраст: 23, курс: 3, средняя оценка: 9.1
              -----------------------------------------------------------------------
              Имя студента: Иван, пол: m, возраст: 22, курс: 3, средняя оценка: 8.3
              Имя студента: Николай, пол: m, возраст: 28, курс: 2, средняя оценка: 6.4
              Имя студента: Петр, пол: m, возраст: 35, курс: 4, средняя оценка: 7.0
              -----------------------------------------------------------------------
              Имя студента: Елена, пол: f, возраст: 19, курс: 1, средняя оценка: 8.9
            */
        
        
        /**
         * еще раз минус этого способа в том, что проверки надо для фильтрации конкретно прописывать, но зато класс StudentInfo мы уже не трогаем
         * мы один раз написали метод testStudent  и он будет подходить под все.Если нам понадобитс что-то добавить, то нужно будет каждый раз создавать
         * новые классы которые имплементируют этот интерфейс и создавать объект этих классов, чтобы использовать их как параметр нашего метода
         * вообщем этот способ тоже в чем то хуже, в чем то лучше, но есть 3й способ, самый короткий и простой это использование лямда выражений (см.Example-3)
         */
        
        

    }
}
