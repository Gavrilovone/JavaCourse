package lesson31_Generics;

public class Parametrized_class {

    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Привет");
        System.out.println(info1); // [{Привет}]
        String s = info1.getValue();
        
        Info<Integer> info2= new Info<>(100);
        System.out.println(info2); // [{100}]
        Integer i = info2.getValue();
        
    }

    /**
     * таким образом обеспечиветя многоразовость, мы создали объект, указали нудный тип, String или Integer и этот тип автоматически подсталяется вместо типа T и нам не нужно повторно писать код конкретно для других типов
     */
    
    
}

class Info<T> { // T это тип, какой-то типа 
/**
 * вместо Т можно писать что угодно, просто принято писать одну букву заглавную можно писать несколько типов Info<T, E>
 * Т называется type placeholder(заполнитель типа) тo-есть он временно заполняет типа данных, который будет заменен потом на существующий тип данных
 */
    private T value; // этого типа у наас есть переменная

    public Info(T value) { // значене этого типа мы передаем в конструкторе и
        this.value = value; // назначаем это нашей переменной value
    }

    @Override
    public String toString() {
        return "[{" + value + "}]";
    }
    
    public T getValue(){
        return value;
    }

}
