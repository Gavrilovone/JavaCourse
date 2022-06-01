
package lesson24_Abstract_methods_in_Interface.Java8;


public class Static_methods_in_interface {
    
}

interface I3{
    default void abc(){
        System.out.println("Это метод abc");
    }
    static void def(){
        System.out.println("Это static метод1");
    }
} 
 interface I4{
 static void def(){
        System.out.println("Это static метод2");
    }
 }


class R { // сдесь мы не имплемнтируем нтерфейс
    public static void main(String[] args) {
        /**
         * мы не можем вызвать статический метод def
         * ни так def();
         * ни так R.def();
         * статический метод не наследуется из интерфейсов в класс, чтобы мы могли обращаться к этому
         * методу с помощью названия класса.Мы можем обращаться к этому статическому методу только с помощью
         * названия интерфейса(в данном случае I3) причем  даже если мы не имплементируем интерфейс, здесь уже 
         * играет роль область видимости(если интерфейс имеет дефолтный access modirier, то класс R уже не увидит его) 
         * если не указать самостоятельно, то компилятор добавит в определение всех static методов слово public
         */
        I3.def();
        I4.def();
}
    
    class R2 implements I3,I4{ // так можно потому что все равно вызов статик метода через название интерфейся
    
    }
        }