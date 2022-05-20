package Lesson14_tradition_for_break_continue;

// Программа с использованием  nested loop
public class nested_loop {

    // метод который выодит на экран минуты
    public void time() {
        OUTER: for (int chas = 0; chas <= 23; chas++) { // OUTER это имя lable , имя внешнего loopa 
            System.out.println("Начало outer loop"); 

            INNER: for (int minuta = 0; minuta <= 59; minuta++) { // внутри цикла создаем еще один цикл

                System.out.println(chas + ":" + minuta);
                if(minuta==30){   // если минута равна 30, остановить цикл
                  //  break;  это break выводит только из внутреннего loopa
                  break OUTER; // теперь остановится внешний  loop 
                  
                }

            }
            // if(minuta==30){
            //    break;      будет ошибка, так как minuta используется и существует только во внутреннем loope
            // }
            System.out.println("конец outer loop"); 

        }
    }

    public static void main(String[] args) {
        nested_loop t = new nested_loop();
        t.time();
    }

}
