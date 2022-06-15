
package lesson27_Exсeptions;
import java.io.*;
public class Example_exception_8_nested {
    
}

class Test13{
    static FileInputStream fis1, fis2;
    public static void main(String[] args) {
        try{ // внешний
            fis1 = new FileInputStream("test1.txt");
                System.out.println("Файл Test1 существует в системе и найден");
                try{ // внутренний
                    fis2.close(); // попытка закрыть стрим файла которого нет 
                    /**
                     * fis2 ссылатся на null по-этому будет выбрасывать NullPointerException
                     */
                }
                catch(IOException e) { // внутренний
                    System.out.println("Вышли проблемы со стримом от fis2");
                }
        }
        catch(FileNotFoundException e){
            System.out.println("файл test не найден");
        }
        catch(NullPointerException e){ // внутренний catch не ловит NullPointerException поэтому ловим его внешним
            System.out.println("Сработал NullPointerException");
        }
        
    }
}

/**
 * output:
 * Файл Test1 существует в системе и найден
   Сработал NullPointerException
 */