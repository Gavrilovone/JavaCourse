
package lesson11;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Иван", 2, 5.6);
        Student st2 = new Student("Петр", 3, 7.2);
        Student.swap(st1, st2);
        System.out.println(st1.name);
        System.out.println(st2.name);
        Student.changeName(st2);
        System.out.println(st2.name);
        
    }
}
