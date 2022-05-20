package lesson21_PovtorenyeMelochey;

/*

 */
public class Return {

    int abc() {
        return 5;
    }

    /* 
      Пример когда returnType не последнее предложение в методе. return type должен быть последним statement код которого выаолняется

     */
    int abc2(int i) {
        if (i > 10) {
            return 5; // если условие true, то return 5 будет последним стэйтмантом код которого выполнится, но он не последний
        } else {      // в предложении 
            return 10;
        }
    }

    // мы можем писать return type в метод , где return type void
    void abc3() {
        System.out.println("Привет");
        return; // писать можно но в данном случае смысла нет, метод и так заканчивается
                // . но после него, уже ничего написать не сможем
    }

    void abc3(int i) {
        if (i > 3) { 
            return;// тут смысл есть, так как если условие вполнится это будет последним statement
        }
        System.out.println("Привет");
        
    }

    public static void main(String[] args) {
        int a = new Return().abc(); // a = 5
        new Return().abc();// не обязательно метод который возвращает какое нибудь значение, должен быть присвоен переменной
    }

}
