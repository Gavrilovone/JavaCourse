package lesson27_Exсeptions;

public class Example_exception_6_nested {

}

class Test11 {

    void abc() {
        int[] array = {1, 2, 3};
        try { // (0)
            System.out.println(array[7]); // (1)
        } catch (ArrayIndexOutOfBoundsException e) { // (2)
            String s = null; // (3)
            {
                System.out.println(s.length());// (4)
            } 
        } catch (NullPointerException e) { // (5)
            System.out.println("Пойман NullPointerException ");
        }

    }

    public static void main(String[] args) {
        Test11 t = new Test11();
        t.abc();
    }

}

/**
 * это выражение выбрасывает ArrayIndexOutOfBoundsException (1) 
 * catch ловит этот exception (2)
 * и заходит  в свое тело (3)
 * Выбрасывает NullPointerException (4)  и он же будет выведен в output так как второй exception закрывает первый
 * но этот exception (4) не может быть поймат catch блоком (5), оба catch блока предназначены для того чттобы ловить исключений try блока (1) 
 * Если в catch блоке (2) выбрасывается исключение, то оно может быть поймано только catch блоками которые являются внутренними для этого catch блока
 * 
 * 
 * output:
 *      Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
	at lesson27_Exсeptions.Test11.abc(Example_exception_6.java:16)
	at lesson27_Exсeptions.Test11.main(Example_exception_6.java:26)
        C:\Users\User\AppData\Local\NetBeans\Cache\13\executor-snippets\run.xml:111: The following error occurred while executing this line:
        C:\Users\User\AppData\Local\NetBeans\Cache\13\executor-snippets\run.xml:68: Java returned: 1
       
 * выбросился NullPointerException и catch блок поймал его, но catch блок сам потом выбросил NullPointerException, который уже никем не ловится
 * 
 * Если мы поместим statement (4) в блок try, то этот блок try уже является внутренним блоком блока try(0)
 *      
 *              try {
                  System.out.println(s.length());// (4)
                  } 
                catch (NullPointerException e2) {
                System.out.println("это внутренний catch блок");
                }
   
 *  то увидим в output: это внутренний catch блок
 */
