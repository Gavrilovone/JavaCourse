package lesson23_Overriding_Hiding_Final;

public class Example {

    public static void main(String[] args) {
        Animals a = new Mouse();
    //  Animals a = new Mouse();  output будет одинаковый так как run time определяет  к какому объекту относится showName
        a.showInfo(); // Name of animal: Mouse
    }

}
  
class Animals {

    String showName() {
        return "Some animal";
    }

    void showInfo() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse extends Animals {

    @Override
    String showName() {
        return "Mouse";
    }
 }

/**
 * output Name of animal: Mouse
 * 
 * Run time binding говорит нам о том, что на самом деле  в памяти создается объект Mouse и переменная a ссылается на него
 * поэтому вызывайте метод showInfo который находится в классе Mouse. Класс Mouse не перезаписывает метод showInfo поэтому
 * использует этот метод из класса Animal, но тем немение вызывается метод showName относящийся к созданному объекту 
 * В теле этого метода run time говорит нам о том, что вызывайте метод showName из класса Mouse, где этот метод был 
 * перезаписан. У класса Animal тоже есть showName, но compile time ничего не знает о этом методе из его subкласса 
 */
