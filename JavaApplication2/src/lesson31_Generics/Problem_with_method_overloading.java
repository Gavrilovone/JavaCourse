package lesson31_Generics;

import java.util.ArrayList;

public class Problem_with_method_overloading {

    public void abc(Info<String> info) {
        String s = info.getValue();
    }
    
    /**
     *  public void abc(Info<Integr> info) {
        Integer s = info.getValue();
    }
    * 
    * проблема в том, что после type erasure (удаления типов ) эти 2 метода будут одинаковыми по-этому сейчас нельзя так записать, 
    * можно записать либо один либо другой.сейчас второй метод закоментирован поэтому ошибки нет
     */
}

class GenMethod {

    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}

class Parent{
      public void abc(Info<String> info) {
        String s = info.getValue();
    }
}

class Child extends Parent{
    /**
     *  @Override
      public void abc(Info<Integer> info) {
        Integer i  = info.getValue();
    }
    
    *  такой оверайдин нельзя делать, компилятор понимает, что при кастинге в сабклассе будут возникать проблемы
     */
     
}
