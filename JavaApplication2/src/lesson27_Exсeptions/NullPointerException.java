
package lesson27_Exсeptions;
import java.util.*;

public class NullPointerException {
    static ArrayList<String> list;
    public static void main(String[] args) {
        list.add("hi"); //  если поместить static ArrayList<String> list; то компилятор начнет уже ругаться так как локалтная переенная не инициализирована
    }
    /**
     * так как list не инициализиован, его default значение nullb  и  output:
     * 
     * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.util.ArrayList.add(Object)" because "lesson27_Exсeptions.NullPointerException.       list" is null at lesson27_Exсeptions.NullPointerException.main(NullPointerException.java:8)
       C:\Users\User\AppData\Local\NetBeans\Cache\13\executor-snippets\run.xml:111: The following error occurred while executing this line:
       C:\Users\User\AppData\Local\NetBeans\Cache\13\executor-snippets\run.xml:68: Java returned: 1
     */
    
}
