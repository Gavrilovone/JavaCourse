package Lesson30_lamda_part2;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

/**
 * есть функциональные интерфесы: Consumer - потребитель (под потреблением объекта мы понимаем, что мы хотим сделать что-то с этим объектом) 
 * Supplier - поставщик
 */
public class Function_interfaces {

}

class Car {

    String color;
    String model;
    double engine;

    Car( String model, String color, double engine) {
        this.color = color;
        this.engine = engine;
        this.model = model;
    }

    /**
     * произведем оверрайд метода toString:
     */
    @Override
    public String toString() {
        return "Our car is " + model + ", color is " + color + ", and engine =  " + engine;
    }
}

class Test {

    public static ArrayList<Car> creatThreeCars(Supplier<Car> carSuplier) { // метод который будет создавать нам 3 машины
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSuplier.get()); // вызываем единственный абстрактный метот get() интерфейса Supplier

        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> consumer) {
        consumer.accept(car); // а что делает метод accept с нашей машиной мы будем задавать при использовании этого метода
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = creatThreeCars(() -> new Car("Toyota corolla", "Black", 1.6));
        /**
         * пустые скобки creatThreeCars(() - поту что метод get не принимает параметров, возвращает тип Car
         */
        System.out.println("Our cars " + ourCars);

        /**
         * output: Our cars [Our car is Black, color is Toyota corolla, and engine = 1.6, Our car is Black, color is Toyota corolla, and engine = 1.6, 
         * Our car is Black, color is Toyota corolla, and
         * engine = 1.6]
         */
        changeCar(ourCars.get(0), car -> { // dspdfkb метод и внутри метода сказали как должен выглядеть метод consumer-a
            car.color = "red";
            car.engine = 2.4;
            System.out.println("Updated car: " + car);
        });
        System.out.println(ourCars);
/**
 * output:
 * Updated car: Our car is Toyota corolla, color is red, and engine =  2.4
   [Our car is Toyota corolla, color is red, and engine =  2.4, Our car is Toyota corolla, color is Black, and engine =  1.6, Our car is Toyota corolla,
   * color is Black, and engine =  1.6]
 */
    }
}
