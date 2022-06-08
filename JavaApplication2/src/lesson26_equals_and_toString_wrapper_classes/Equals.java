
package lesson26_equals_and_toString_wrapper_classes;
/**
 * метод equals принадлежит классу Object, а соответственно он имеется во всех классах java
 * Если вы перезаписываете метод equals, всегда используйте в его параметре тип данных Object
 * правильно и логично перезаписанный метод equals должен обладать следующими свойствами:
 * 1.Симметричность - для non-null ссылочных переменных a и b, a.equals(b) возвращает true тогда и только тогда,
 * когда b.equals(a) возвращает так же true
 * 2.Для non-null ссылочной переменной a,  a.equals(a) - всегда должно возвращать true, тоесть объект равен сам себе всегда
 * 3.Транзитивность - для non-null ссылочных переменных a и b и с, если a.equals(b) и b.equals(c) возвращает true, то
 * a.equals(c) - тоже должно возвращать true
 * 4.Постоянство - для non-null ссылочных переменных a и b, неоднократный вызов a.equals(b) всегда должно возвращать или 
 * только true или только false 
 * 5.Для non-null ссылочной переменной a, a.equals(null) - всегда должно возвращать false
 * 
 */

public class Equals {
    public static void main(String[] args) {
        Car c1 = new Car("red", "v5");
        Car c2 = new Car("red", "v5");
        Car c3 = new Car("black", "v8");
        /**
         * метод equals по умолчанию, если он не перезаписан, работает так же как "==" то-есть вернет true тогда и только тогда, если переменные ссылаются
         * на один объект, по умолчанию он выглядит так:
         * 
         *               public boolean equals(Object obj) {
         *                   return (this == obj);
         *               }
         */
        System.out.println(c1==c2); // false (true после перезаписи)
        System.out.println(c1.equals(c2)); // false ( false так и осталось)
    }
}

class Car{
    String color;
    String engine;
    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }
    
    /**
     * Перезапишем метод equals:
     */
    
    @Override
    public boolean equals(Object obj) { // всегда нужно использовать параметр типа Object иначе это уже overload а не ovveride и работать будет не корректно
        if(obj instanceof Car){ // проверяем является ли obj Car, потому что если нет, то нет смысла сравнивать, по умолчанию уже не будут равны 
            /**
             * returne (color.equals(obj.color) && engine.equals(obj.engine));  - obj не является объектом Car, поэтому необходимо сделать casting:
             */
            Car c = (Car)obj;
            return (color.equals(c.color) && engine.equals(c.engine)); 
        }
        else {
            return false; // если obj не является Car, возвращаем false
        }
    }
         
}
