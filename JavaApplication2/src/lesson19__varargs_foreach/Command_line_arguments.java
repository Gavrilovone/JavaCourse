/*
  Command line arguments:
  Все элементы командной строки являются элементами типа данных String
  javac Test1.java
  java Test1 Hello 14 true = это тоже самое что и String args[] = {"Hello","14","true"};


*/
package lesson19__varargs_foreach;

public class Command_line_arguments {
    public static void main(String[] args) {
        System.out.println("Нулевой элемент: "+ args[0]);
        System.out.println("Всего элементов: " + args.length);
    }
}
