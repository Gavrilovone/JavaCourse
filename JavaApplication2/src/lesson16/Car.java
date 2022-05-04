/*
   почему  String я вляется immutable:
  1. String хранит свое начение в private массиве, к тому же, массив имеет фиксированную длинну
  2. String хранит свое значение в final массиве, т.е. он инициализируется только 1 раз.
  3. Не один из методов класса String не изменяет индивидуальные элементы массива типа char.
 */
package lesson16;

public class Car {

    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;

    }

    public Car abc(String cvet) {
        Car c10 = new Car(cvet, "V6");
        return c10;

    }

    public static void main(String[] args) {
        Car c = new Car("Зеленый", "V4");
       Car c2 = c.abc("Черный");
        System.out.println(c.color);
    }

}
