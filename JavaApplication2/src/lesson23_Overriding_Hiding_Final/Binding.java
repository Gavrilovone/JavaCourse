
package lesson23_Overriding_Hiding_Final;
      /**
         * Employee e2 = new Teacher1();
         * несмотря на то что e2 это reference переменная типа Employee настоящий объект на который
         * ссылается переменнаяe e2 это объект класса Teacher1.
         * 
         * но как определить когда вызывается метод из типа данных переменной(в данном случае Employee) или из 
         * типа данных созданного объекта(в данном случае Teacher1)?  поможет определение Biтding(связь)
         * Binding - это определение вызываемого метода, основываясь на объекте который производит вызов или
         * тип данных reference variable
         * 
         * Существует compile time binding(во время компиляции, по другому он называется static binding)
         * к этому типу binding относится private methods, static methods, final methods(все эти методы 
         * не могут быть overridded) тоесть мы не можем перезаписать их в sub классе, поэтому зачем ждать run time, 
         * произойдет compile time binding
         * 
         * и run time binding(когда компилятор не в силах определить на какой объект ссылается referance переменная) 
         * это происходит runtime во время выполнения. тоесть run time binding относится ко всем остальным методам
         * 
         * все переменные имеют compile time binding, тоесть тип переменных определяет компилятор
         */
public class Binding {
    void abc(Animal a){
        System.out.println("A");
    }
    void abc(Mouse m){
        System.out.println("M");
    }
    public static void main(String[] args) {
        Binding b = new Binding();
        Animal an = new Mouse();
        /**
         * здесь не нужна run time проверка, что на самом деле объект на который ссылается переменная an типа Mouse, потому что
         * an используется как простая переменная. ее взяли поставили в параметр и спросили какого она типа - она типа Animal
         */
        b.abc(an); // A
        /**
         * но если бы мы  через an вызывали бы метод getName:
         */
        an.getName();
        /**
         * то компилятор бы уже не смог бы определить каккой метод стоит вызывать run time оперделилось бы , что стоит вызывать метод Mouse
         * потому что run time определяется, что переменная an ссылается на объект M ouse
         */
        
    }
}
  
class Animal{
    void getName(){
        System.out.println("Animal");
    }
}

class Mouse extends Animal{
    void getName(){
        System.out.println("Mouse");
    }
}
       
    
