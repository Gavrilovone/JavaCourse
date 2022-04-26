/*
  ! Когда мы подставляем reference тип данных в параметр, то на самом деле подставляется не
  не сам reference, а его копия. с помощью reference мы можем менять элементы, но не можем менять сам объект
 
 */
package lesson11;


public class Student {
    String name;
    int course;
    double grade;
    
    Student(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
        
    }
    
    public static void swap(Student s1, Student s2){ // метод static потому , что нам не нужен никакой объект, чтобы поменять студентов местами
        Student s3 = s1;
        s1 = s2;
        s2 = s3;  
        System.out.println(s1.name);   // в output выдет имя Петр, но он будет существовать, только внутри метода     
    }
    
    public static void changeName(Student s1){  
        s1.name = "Алексей"; // имя поменяется, потому что мы меняем элемент , а не сам объект
    }
     
}