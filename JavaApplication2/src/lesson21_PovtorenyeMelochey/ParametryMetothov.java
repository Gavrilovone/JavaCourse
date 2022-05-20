package lesson21_PovtorenyeMelochey;

/*
  Параметры overloaded метода могут быть как примитивные так и ссылочные типы данных 
 */
public class ParametryMetothov {

    public void abc(String s) {
        System.out.println(s);
    }

    public void abc(boolean b) {
        System.out.println(b);
    }
    
    private StringBuilder abc(StringBuilder sb){
        System.out.println(sb);
        return new StringBuilder("Пока");
    }

    /*
    При вызове метода требующего в параметр тип данных int мы можем использовать тип данных char. 
    потому что в основе char лежит int, который определяет порядковый номер символа.
    */
    
    void abc(int i){
        System.out.println(i);
    }
    public static void main(String[] args) {
        char с = 'a';
        ParametryMetothov pm = new ParametryMetothov();
        pm.abc(с); // 97
    }
    
}
