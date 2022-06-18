/**
 * это изменение non-static, non-final метода в sub классе, который он унаследовал от parent класса
 * т.е это презаписанные методы в субклассе которые были унаследованы от суперкласса.
 * 
 * Методы считаются overridden если:
 * - имя в sub классе такое же как и в parent классе
 * - список аргументов в sub классе такой же как и в parent классе
 * - return type в parent классе такой же, что и в parent классе. либо return type в sub
 * классе это sub класс return type из parent класса(covariant return type) ковариантный. т.е. все sub классы
 * родительского класса могут быть  в качестве return type
 * access modifier в sub классе должен быть такой же или менее строгий чем в parent классе. потому что 
 * например если бы у parent класса был бы дефолтный, а  у sub класса был бы access modifier более строгий 
 * например(private), то следующий наследник уже не видел бы родителя и вся логика наследования ломается
 * - метод с sub классе тоже должен быть non-static
 * 
 * overriding может быть только у методов. у variable его быть не может!
 * Если мы не хотим чтобы наш метод был перезаписан в sublasse, мы делаем его final в parent classe
 */
package lesson23_Overriding_Hiding_Final;

public class Method_overriding {
   public static void main(String[] args) {
        Employee e = new Employee();
        Teacher1 t = new Teacher1();
        Employee e2 = new Teacher1();
         
        e.eat();// кушает работник
        t.eat(); // кушает учитель
        e2.eat(); // кушает учитель
    }
}
  
class Employee {

    double salary = 100;
    String name = "Иван";
    int age;
    int experience;

    void eat() {
        System.out.println("Кушает работник");
    }

    void sleep() {
        System.out.println("Спит");
    }
}

class Teacher1 extends Employee {

    int numberOfStudents;

    void teach() {
        System.out.println("Учит");
    }
   
    @Override
    void eat() { // overridden метод
        System.out.println("Кушает учитель");
    }
        
 }
   

  