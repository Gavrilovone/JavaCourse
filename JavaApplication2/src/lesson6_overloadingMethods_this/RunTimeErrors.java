
package lesson6_overloadingMethods_this;

/**
 * Существуют 2 типа ошибок это ошибки компилятора и
 * RunTime ошибки при запуске. в даном примере синтактически все верно,
 * и компилятор не ругается, но при запуске будет ошибка. так как на 0
 * делить нельзя. выдаст исключение: Exception in thread "main" java.lang.ArithmeticException: / by zero 
 * 
 */

public class RunTimeErrors {
    public static void main(String[] args) {
        int a =  50/0;
    }
}
