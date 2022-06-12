
package lesson27_Exсeptions;
/**
 * SubClasses RunTimeException = Unchecked exceptions(unchecked переводится как непроверенный) тоесть RunTimeException это исключения
 * которые необязательно проверять
 * runtime исключения бывают в коде, в котором присутствуют ошибочные выражения, тоеть в выбросе данных исключений виноват программист,
 * компилятор не всилах проверить возможность выброса runtime исключений
 * Rintime exceptions можно не обрабатывать, тоесть не помещать в try  и catch
 * Rintime exceptions можно не объявлять , тоесть throws NullPointerException можно не писать, даже если исключение выбрасывается
 * Но при желании можно сделать и то и другое
 */

public class SubClasses_RunTimeException_unchecked_exceptions {
    
}

class Test2{
    
   void abc() throws NullPointerException{ 
       /**
        * Мы говорим, что может выбрасываться это исключение, не факт, что выйдет, но может
        */
        String s = null;
        System.out.println(s.length()); 
        /**
         * компилятор не всилах определить тут s ссылается на null или какой-то объект поэтому на уровне компиляции ошибки нет, но уже runtime
         * java определяет , что s ссылается на ничто, а у ничто нельзя измерить длинну и вылетает исключение NullPointerException
         */
   }
           
    public static void main(String[] args) {
        int[] array = {1, 4, 0};
       
        System.out.println("Hello");
        
    }
}
