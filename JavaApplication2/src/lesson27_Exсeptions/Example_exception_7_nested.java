
package lesson27_Exсeptions;


public class Example_exception_7_nested {
    
}

class Test12{
    static String abc(){
        String s1 = "";
        String s2 = null;
        
        try{
            try{ // (0)
                s1+="1"; // (1)
                s2.charAt(3); // (2)
                s1+="2";
            }
            catch(NullPointerException e){
                s1+="3"; // (3)
                throw new RuntimeException(); // (4)
            }
            finally{
                s1+="4"; // (5)
                throw new Exception(); // (6)
            }
        }
        catch (Exception e){ // (7)
            s1+="5";
        }
        return s1;
    }
    
    public static void main(String[] args) {
        System.out.println(abc());
    }
}
/**
 *  пытаемся прибавить к s1 еденицу (1) - конкатенация
 * далее на s2 который null пытаемся вызвать метод и на этой строчке (2) выбрасывается NullPointerException 
 * мы делаем его catch и прибавляем к s1 три (3)
 * потом выбрасываем (4) RuntimeException(), епстественно он не ловится 
 * в finally прибавляем к s1 четыре (5)
 * и выбрасываем new Exception(); (6) тесть внешний try (0) выбрасывает new Exception
 * внешний catch ловит этот exception (7) и прибавляет к s1 пять
 * метод возвращает s1
 * 
 * output: 1345
 * 
 */