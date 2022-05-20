package lesson13_switch;

public class Employee {

    public static void main(String[] args) {
        switch ("Воскресенье") { // switch может работать, токлько с типами данных byte, short, int, char, String
            case "Понедельник":
                System.out.println("В понедельник: Работа до 17:00"); // switch работает с compile time constants, причем
                break;                                                // если final veriable объявляется позже например:
            case "Вторник":                                           //                    final int a;
                System.out.println("Во вторник: Работа до 17:00");   //                     final int b;
                break;                                               //                      a = 10
            case "Среда":                                            //    b = 5;    то в switch их использовать нельзя           
                System.out.println("В среду: Работа до 17:00");
                break;
            case "Четверг":
                System.out.println("В четверг: Работа до 17:00");
                break;
            case "Пяиница":
                System.out.println("В Пятницу: Работа до 16:00");
                break;
            case "Суббота":
                System.out.println("В субботу: Работа до 14:00");
                break;
            case "Воскресенье":
                System.out.println("В воскреенье: Выходной");//  В воскреенье: Выходной
                break;
            default: System.out.println("такого дня не существует");
                
        }
    }
}
