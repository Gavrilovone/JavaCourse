/*
  Превращение конструктора в метод при помощи return type
 */
package lesson21_PovtorenyeMelochey;

public class Test {

  /*void*/ Test() { // ели добавить return type в данном случае void, то конструктор становится методом,
                    // потому что у конструктора return type нет              
        System.out.println("Создался объект");
    }
}

class A {

    public static void main(String[] args) {
        Test t = new Test(); // Создался объект
        
      //Test t = new Test(); // пусто  - так как Test это метод и тут вызывается default конструктор
    }
}
