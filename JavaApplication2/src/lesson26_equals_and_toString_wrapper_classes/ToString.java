package lesson26_equals_and_toString_wrapper_classes;

/**
 * Метод toString так же принадлежит классу Object, возвращает строковое представление объекта.Дефолтная реализация возвращает
 * имя класса, @, число(как результат метода hashcode данного объекта)
 */
public class ToString {

    public static void main(String[] args) {
        Car c1 = new Car("red", "v5");
        Car c2 = new Car("red", "v5");
        Car c3 = new Car("black", "v8");
        System.out.println(c3); // lesson26_equals_and_toString_wrapper_classes.Car@6d311334
        System.out.println(c3); // Car color blackengine v8 (после перезаписи метода toString)
        /**
         * by default метод toString вызывается, хотя можно явно написать  System.out.println(c3.toString()) разницы нет
         */
    }
}

class Car {

    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    /**
     * сделаем override методв toString
     */
    @Override
    public String toString() {
        return "Car color " + color + "engine " + engine; 
    }
}
