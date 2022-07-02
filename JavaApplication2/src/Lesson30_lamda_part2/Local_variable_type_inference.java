
package Lesson30_lamda_part2;

import java.util.ArrayList;

public class Local_variable_type_inference {
    public static void main(String[] args) {
        TestInferenceType ts1 = new TestInferenceType();
        /**
         * так получается длинно есть возможность писать короче
         */
         var ts2 = new TestInferenceType();
         /**
          * Java понимает, что раз справа мы используем конструктор вот этого класса TestInferenceType, то тип переменной
          * ts1 будет TestInferenceType.Компилятор потом сам изменет код и вместо var вставляет тип (Название класса)
          * такое написание относится только к локальным переменным
          * 
          * как можно писать:
          */
         
         var i = 10; // компилятор понимает, что это int
         var w = 1.5f; // компилятор понимае, что это float
         var array = new String[]{"a", "b"};// сдесь вместо var компилятором потом будет подставлено String[] 
         /**
          * допкстим есть метод double abc(){return 3.14;} - можем написать
          */
         var result = abc(); // компилятор понимает, что abc() возвращает double, поэтому resault будет double
         Object obj1 = "Привет";
         var obj2 = obj1; // из-за того, что obj1 имеет тип Object, obj2 тоже будет иметь тип Object, а не стринг
         
         ArrayList<String> al = new ArrayList<>();
         for(var s: al){
             System.out.println(s); // компилятор понимает, что al это Arraylist который принимает типы данных String, поэтому s будет типа данных String
             
             var var = "var"; // var не является зарезервированным словом, поэтому так писать можно, но это плохая практика
         }
         
         /** 
          * как писать нельзя:
          * 
          * нельзя писать например var v =10; вне метода
          * нельзя импользовать var внутри параметра метода
          * нельзя просто декларировать например var h;  - нужно сразу какое то значени ему придавать var h = "пока";
          * мы не можем писать var n = null; так как тип у null не определен
          * нельзя писать var array = {1, 2}; тип должен  быть указан при инициализации массива var array = new int[] {1, 2};
          * нельзя писать var [] array = {1, 2}; если используем var, мы не должны писать [] потому что и так понятно, что var это int[]
          * нельзя писать var в return type метода static var abc(){return 3.14;}
          */
    }
    
    
    
   static double abc(){return 3.14;}
}

class TestInferenceType{

}
