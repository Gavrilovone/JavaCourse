
package lesson27_Exсeptions;

import java.io.*;


public class Example_exception_2 {
    
}
class Test6{
    public static void main(String[] args) {
       //  try{
        File f  = new File("test.txt");
         //ileImputStream fis = new FileInputStream(f);
          System.out.println("Всем хорошего дня");
        }
        /**
         * можно написать несколько блоков catch, очередность не имеет значения если они никак не относятся друг к другу, нет is a связи,
         * а если таковые есть и у нас произойдет исключение FileNotFoundException, то выбросится например exception родитель IOException который 
         * записан первым, то до исключения FileNotFoundException не дойдет.Компилятор предупредит об этом ошикой, что имеет место unreachable код
         * Чтобы этого не произошло, вегда сначала идут child классы исключений, потом родительские
         * 
        catch(IOException e){
            System.out.println("Поймано исключение 3");
            
        catch(FileNotFoundException e){
            System.out.println("Поймано исключение 1");
        }
        catch(NullPointerException e){
            System.out.println("Поймано исключение 2");
        }
         */
        
    }
//}
