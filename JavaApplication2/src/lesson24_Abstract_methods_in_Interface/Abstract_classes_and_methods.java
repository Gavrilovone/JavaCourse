package lesson24_Abstract_methods_in_Interface;

public class Abstract_classes_and_methods {

    public static void main(String[] args) {
/**
 * можно использовать referance variable типа abstract класса, чтобы ссылаться на объект дочернего класса
 * который не является abstract:
 */
        Figure f1 = new Square();
        /**
         * естественно с помощью этой reference переменной я могу обращаться только к тем элементам класса
         * которые есть у фигуры:
         */
        System.out.println(f1.numberofsides); // 0 
        /**
         * потому что compile binding происходит, f1 типа Figure, а количество сторон в классе Figure 0
         */
        
        f1.area(); // area of the square = 100
        /**
         * потому что run time binding происходит, площадь вызвалась для объекта Square
         */
    }
}

/**
 * У abstract методов не может быть тела, даже пустого
 * Невозможно создать объект abstract класса
 * Если в классе есть abstract метод, то этот класс тоже должен быть abstract
 * Abstract класс может содержать, а может и не содержать abstract vtnjls
 * Abstract класс должен перезаписать все abstract методы или сам должен быть abstract
 * Abstract класс не может быть final, абстарктный класс пишут для того чтобы он имел наследников, a final класс не наследуется
 * Переменные не могут быть abstract
 * У abstract классов есть конструктор
 * Любой перезаписанный метод может быть как abstract так и не abstract
 * Для методов недопустимо сочетание: final abstract, private abstract, static abstract
 */

abstract class Figure {
    /**
     * конструктор:
    Figure(int numberofsides ){
        this.numberofsides = numberofsides;
    }
    */ 
    int numberofsides = 0; // количество сторон
   abstract void area();  // площадь
    
   abstract void perimetr(); // у абстрактного метода нет тела, потому что оно не известно
   void showInfo(){ // у абстрактного класса может быть неабстрактный метод
       System.out.println("This is figure!");
   }
/**
 * Мы не можем здесь в методах описать какую либо общую вещь, которая будет подходить ко всем классам, так или 
 * иначе нам придется перезаписывать методы или хайдить переменные под конкретный класс, потому что площадь или 
 * периметр расчитывается поразному для разных фигур
 * 
 * Класс Figure не знает, что эти методы должны делать, но он знает, что они должны быть, Figure в даном случае это 
 * категоризация, тоесть все объекты будут под категорией фигура, но в реальности объекта фигура не существует, это 
 * абстрактное понятие
 */
}

class Square extends Figure{
        /**
         * конструктор:
        Square(int numberofsides ){ 
            super(numberofsides);
            this.numberofsides = numberofsides;
        }
        */
    int numberofsides = 4; //field hides another field
    int side = 10;
    @Override
    public void perimetr(){
        System.out.println("perimeter of the square = "+ side*4);
    }
     @Override
    public void area(){
        System.out.println("area of the square = "+ side*side);
        /** 
         * класс Square  перезаписал все абстрактные методы abstract parent класса Figure
         */
    }
}

class Rectangle extends Figure{ // прямоугольник
    int numberofsides = 4; //field hides another field
    int side1 = 8;
    int side2 = 5;
     @Override
    public void perimetr(){
        System.out.println("perimeter of the rectangle = " + 2*(side1+side2) );
    }
     @Override
    public void area(){
        System.out.println("area of the rectagle = "+ side1*side2);
    }
}

class Circle extends Figure{
    int numberofsides = 0; //field hides another field
    int radius = 3;
    @Override
    public void perimetr(){
        System.out.println("perimeter of the circle = " + 2*3.14*radius );
    }
     @Override
    public void area(){
        System.out.println("area of the circle = "+ 3.14*radius*radius);
    }
}

/**
 * если мы захотим создать дочерний класс , но не хотим оверайдить методы, то мы можем этот класс сделать тоже abstract:
 */
abstract class quadrilateral extends Figure{ // четырехугольник
    void def(){
        System.out.println("this is quadriateral");
    }
}