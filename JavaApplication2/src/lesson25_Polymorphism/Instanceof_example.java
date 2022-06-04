package lesson25_Polymorphism;

public class Instanceof_example {

    public static void main(String[] args) {
        Jumpable j = new Man();
        Man m = new Man();
        Student s = new Student();
/**
 * Всегда проверяется конкретный объект который был создан, не переменную которая ссылается на объект, а сам объект
 */
        if (j instanceof Jumpable) {
            System.out.println("j is Jumpable");// j is Jumpable
        }
        if (m instanceof Humman) {
            System.out.println("m is Human");// m is Human
        }
        /**
         * if (s instanceof Humman) {
         * System.out.println("s is Human");// ошибка компилятора
         *   }
         * если у класса Student будет  subclass, то у этого sub класса не может быть другого super класса кроме класса Student,
         * соответственно между sub классом класса Studend и классом humman ни какой связи быть не может
         */
        
        if (s instanceof Jumpable) {
            System.out.println("m is Human");// пусто
        }
        /**
         * С классом компилятор не позвалял так писать, а  с интерфейсом позволяет
         * в данном примере компилятор не знает имплементировал ли subкласс класса Student(если он будет или есть) интерфейс 
         * Jumpable или нет, но связь возможна и он может это сделать и поэтому компилятор не ругается.Но в данном примере нет, 
         * не имплементировал и по-этому условие if выдаст false и на экран ничего не выведится
         *
         */
        
            
      
    }
}

interface Jumpable {

}

class Humman implements Jumpable {
}

class Man extends Humman {
}

class Student {
}
