package lesson22_encapsulation_super_protected;

public class Hummen2 {
    // public Hummen2(String n){
       // name = n;
   // }
    public String name ="Николай";
    public static int salary = 150;

    public void work() {
        System.out.println("Работать");
    }

    public static void rest() {
        System.out.println("Отдыхать");

    }

}
/**
 * Все элемнты public будут наследоаться классом Student. В незавиимости от того где они находятся. потому что они public
 * Если элемент private то он наследоваться не может. так каак он виден только внутри класса. Но работать с этим элементом 
 * можно так же через get и set:
  
  private String name ="Николай";
  puplic getName(){
    return name;
    }
  public setName(String n){
    name = n;
    } 
  
  class Student extends Hummen2{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName);
    }
  }
 * 
 * Если елементы defauil modifier то они наследуются только внутри пакета
 */
class Student extends Hummen2{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary); // более правильная запись для статической переменной
        s.work();
        Student.rest();
    }
}
