
package lesson24_Abstract_methods_in_Interface_Java7;

/**
 * Private интерфейс не может быть abstract
 * Private interface метод может быть использован только внутри интерфейса
 * Private static мотод может быть использован внутри static или non-static методов естественно внутри того же интерфейса
 * Private non-static метод не может быть использован внутри private static метода
 */
public class Interface_beginning_with_Java9 {
    
}
/**
 * для интерфейсов стало можно использовать access modifier private для обычного метода и для статичного: private methods и private static methods
 */

interface I5{
    private static void method1(){ //пока мы не написали private, подразумевалось что он public, но кроме public и private нельзя написать protrcted
        System.out.println("static метод");  
    }
    
    private void method2(){
   /**  
    * если мы ставим access modifier private, то мы обязаны писать тело, в противном случае необходимо сделать метод абстрактным
    * abstract void method2(){}
    */
        System.out.println("non-static метод");
    }
    default void method3(){
        method1();// Private static мотод может быть использован внутри static или non-static методов
    }
    static void method4(){
        method1();// Private static мотод может быть использован внутри static или non-static методов
    }
    
    private static void method5(){
       // method2(); Private non-static метод не может быть использован внутри private static метода
    }
}