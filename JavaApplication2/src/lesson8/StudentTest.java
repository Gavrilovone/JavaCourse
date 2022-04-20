
/*

*/
package lesson8;


public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Иван",2);
        Student st2 = new Student("Петр",1);
        Student st3 = new Student("Елена",3);
        Student st4 = new Student("Елена",6);
        
        System.out.println(Student.count); // изза того, что count статический, тоесть принадлежит всему
        System.out.println(st1.count);   // классу, мы можем иметь к нему доступ таким образом
        
      
    }
}
