package lesson30_lamda_expression;

public class Example_4_with_lamda {

    static void def(Test t) {
        System.out.println(t.abc("Hello")); //  или System.out.println(t.abc()); если метод abc() был бы без параметров
    }

    public static void main(String[] args) {
        def(x -> x.length()); // если метод abc() был бы без параметров, то def(() -> 7) (число, потому что abc должен вернуть int)
    }
}

interface Test {

    int abc(String s);
}

/**
 * output: 6
 */

/**
 * Варианты написания:
 * def( () -> 7 );
 * def( (x) -> x.length() );
 * def( (String x) -> x.length() );
 * def( (x,y) -> x.length() );
 * def( (String x, String y) -> x.length() );
 * 
 * как нельзя, compile time errors:
 * def( x -> {x.length();} ); если есть фигурные скобки, нужно писать return иначе ошибка
 * def( x -> {return x.length()} ); после фигурных скобок обязательно ";" иначе ошибка def( x -> {return x.length()}; );
 * def( x, y -> x.length() ); если 2 параметра, то их нужно поместить в скобки def( (x, y) -> x.length() )
 */

/**
 * внутри тела лямда выражения может быть несколько выражений:
 * 
 * method( (int x, int y) -> {int x=5; return10;} ); - только здесь будет ошибка, потому то x уже объявлена
 * method( (int x, int y) -> {x=5; return10;} ); - но мы можем изменить переменнную
 * method( (int x, int y) -> {int x2 =5; return10;} ); - можно создавать новую переменную в теле
 * 
 */