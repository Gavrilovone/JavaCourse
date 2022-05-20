/*
  если не будет break то будут выполняться все statement после сработанного кейса 
default можно ставить в любое место компилятор всеравно будет смотреть его в последнюю очередь
если не сработает ниодин кейс. но если в середине, то после statement нужен break. default  может и не быть
2х одинаковых кейсов не может быть.


 */
package lesson13_switch;

public class Test1 {

}

class Student {

    int grade;

    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(2);
         
        /* if (st1.grade == 2) {
            System.out.println("Студент двоишник");
        } else if (st1.grade == 3) {
            System.out.println("Cтудент троишник");
        } else if (st1.grade == 4) {
            System.out.println("Студент хорошист");
        } else if (st1.grade == 5) {
            System.out.println("Студент отличник");
        } else {
            System.out.println("Оценка не верна");
        }  */

        switch (st1.grade) {
            case 2:
                System.out.println("Студент двоишник");
                break;
            case 3:
                System.out.println("Cтудент троишник");
                break;
            case 4:
                System.out.println("Студент хорошист");
                break;
            case 5:
                System.out.println("Студент отличник");
                break;
            default:
                System.out.println("Оценка неверна");

        }

    }
}
      