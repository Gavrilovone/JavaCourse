/**
 * Класс может наследовать 0 или 1 класс, для наследования класс использует keyword extends
 * Класс может имплементировать 0 или более интерфейсов, для имплементирования класс использует keyword implements 
 * класс не может наследовать интерфейс
 * интерфейс не может наследовать или имплементировать класс
 * интерфейс может наследовать 0 или более интерфейсов? для наследования интерфейс использует keyword extends
 * Конкретный класс может наследовать конкретный или абстратный класс
 * abstract класс может наследовать конкретный или абстрактный класс и имплементировать интерфейс
 * первый конкретный класс в иерархии, должен снабдить все abstract методы телами
 */
package lesson24_Abstract_methods_in_Interface_Java7;


public class Class_and_Interface_inheritance {
    
}
interface Jampable2{
    void jump();
}

interface A1{
    void abc();
}
/**
 * Может наследовать несколько интерфейсов:
 */
interface A2 extends Jampable2, A1{
    void def(); // у него еще есть свой метод
}