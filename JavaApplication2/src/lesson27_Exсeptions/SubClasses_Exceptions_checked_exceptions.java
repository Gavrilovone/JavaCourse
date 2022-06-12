
package lesson27_Exсeptions;
import java.io.*;


/**
 * Checked исключения указывают на часть кода, который находится за пределами непосредственного контроля программой и который может
 * являться причиной выброса исключений.Они как правило возникают при взаимодействии вашей программы с внешними источникоми(работа с
 * файлами, БД, етью) изза которых и могут возникать проблемы, компилятор всегда проверяет возможность выброса checked исключений
 * checked исключения всегда должны быть или объявлены и/или обработаны
 */

public class SubClasses_Exceptions_checked_exceptions {
    
}

class Test4{
      void abc() throws FileNotFoundException{ // так как мы не знаем как обрабатывать исключение, мы просто его объявляем 
          File f  = new File("test.txt");
         // FileImputStream fis = new FileInputStream(f);
          System.out.println("Всем хорошего дня");
      }
      /**
       * Но так как мы вызываем метод abc в методе def, компилятор знает, что исключение FileNotFoundException может быть выбрашено в методе abc и так
       * как оно небыло обработано там, а лишь объявлено, его необходимо обработать или объявить в методе def
       */
      void def() throws FileNotFoundException{
          System.out.println("Привет");
          
      }
      /**
       * тоже самое и в методе main, исключение надо либо обработать, либо объявить, но если его только объявить, то в случае если файла text.tхt нет, вылетит исключение
       */
      public static void main(String[] args) {
        Test4 t = new Test4();
        
        try{
            t.def();  
          }
          
          catch(FileNotFoundException e){
              System.out.println("Было поймано исключение: " + e);
          }
    }
      
      /**
       * Таким образом если метод a() использует внутри себя метот b(), который может выбросить checked исключение, то метод a() должен:
       * 1.Или заключить метод и в try/catch блоки
       * 2.Или/и(лучше всего и) объявить , что он тоже может выбросить это checked исключение или его super класс(для исклчения FileNotFoundException его 
       * супер клас IOException).Тоесть можно записать void def() throws IOException{} мы даже можем записать void def() throws Exception, потому что
       * Exception является супер классом IOException.но обычно так не пишут , пишут FileNotFoundException
       */

}
  
            
            

