
package lesson24_Abstract_methods_in_Interface_Java7;


public class Ralation_ship {
/**
 * Теперь к объектам обоих классов можно обращаться  через переменные тип этого интерфейса
 */   
    Jumpable j1 = new Animal();
    Jumpable j2 = new Human();
}

/**
 * Допустим у нас есть 2 класса, несмотря на то что они связаны общим пердком Object, у ни отсутствует ralation ship is a
 * class Animal{}
 * class Human{}
 * Но с помощью интерфейса можно сблизить 'mn два класса:
 */

interface Jumpable{

}

class Animal implements Jumpable{}
class Human implements Jumpable{}