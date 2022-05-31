
package lesson24_Abstract_methods_in_Interface.Java8;

public class Default_methods_in_interface {
    
}

interface I1{
    void abc();
    default void def(){
        System.out.println("Это метод def");
    }
    /** 
     * default метод интерфеса можно оверайдить,а можно нет
     * в отличие от абстракных, default метод всегда имеет тело
     * Для чего он нужен:
     * например интерфейс I1 имплементирруют 100 классов, т вдруг нам понадобилось добавить винтерфейс один метод.В этом 
     * случае нам придется оверайдить его во всех классах, чтобы этого избежать придумали default метод, тоесть он имеет тело
     * и мы можем оверайдить его только в нужных нам классах, а не во всех.Jcnfkmyst будут использовать его дефолтную реализацию
     * если мы оверайдим дефолтный метод в классе, необходимо всегда писать public, но само слово default не относится к access
     * modifire
     * default методы не должны быть final, static или abstract
     */
}
class Z2 implements I1{
    @Override
    public void abc(){
        System.out.println("Это метод abc");
    }
}