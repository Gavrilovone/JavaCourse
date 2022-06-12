package lesson27_Exсeptions;

/**
 * существуют блоки try/catch/finally try - пытаться что-то делать catch(ловить) - ловит исключения finaly - это блок,
 * который всегда выполняется, в независимости от того есть исключения или нет
 * try и catch могут быть несколько блоков для разных исключений, а finally блок может быть только один
 * отдельно try без catch или finally писать нельзя, finally может не быть вовсе, но для исключений типа FileNotFoundException обязательно нужен catch
 */

public class Try_catch_finally {

}

class Test1 {

    public static void main(String[] args) {
        int[] array = {4, 8, 1};
        System.out.println("we have an array");
        try {  // пытаемся
            System.out.println(array[5]); // вывести 5ый елемент массива, которого не существует
            System.out.println("have a nice day, everyone"); // поэтому все что есть дальше в теле обработано быть не может
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            /**
             * ArrayIndexOutOfBoundsException e(идет как параметр) - это тип exception который будет пойман catch-ем, e - это будет имя этого исключения
             * тоесть если выбросится из блока try exception ArrayIndexOutOfBoundsException, мы назовем этот exception "e" 
             * если вместо ArrayIndexOutOfBoundsException например прописать NullPointerException, то Java не сможет поймать exception и он выбросится
             */
            System.out.println("an exception was caught: " + e);// если  exception будет пойман, выводим на экран 
        
        }
        finally{ // все что записано в этом блоке, всегда выполняется
            System.out.println("This is finally block");
        }
        
        System.out.println("this code is no longer related to exceptions");
        
    }
    
    /**
     * output: 
               we have an array
               an exception was caught: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
               This is finally block(все что написано в блоке finally всегда выполняется)
               this code is no longer related to exceptions
     * тоесть программа не прервалась, прервался блок try и было поймано исключение и последующий когд уже не имеет отношения к исключениям
     * если попытаться вывести 1 элемент массива  System.out.println(array[1); - то блок try не выбросит exception и блоку catch нечего будет ловить и 
     * output будет: we have an array
                     8
                     have a nice day, everyone
                     This is finally block
                     this code is no longer related to exceptions
     * тоесть эти блоки просто не сработают 
              
     
     * Несмотря на пример ArrayIndexOutOfBoundsException не стоит ловить, это делать, потому что эти исключения выбрасываются только в случае какого-то кривого
     * кода
                 
     */
}
