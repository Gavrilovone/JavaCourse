package lesson16;

public class Test8 {

    public static void main(String[] args) {
        String s1 = "Привет";
        System.out.println(s1.isBlank());// false   Возвращает true если String состоит только из пробелов и табов
        String s2 = "     ";
        System.out.println(s2.isBlank()); // true 
        
        String s3 = "";
        System.out.println(s3.isEmpty()); //true возвращает true если String пустой, тоесть не должно быть ничего , даже пробелов.
        
        String s4 = "    Привет         ";
        System.out.println(s4.strip());// удаляет пробелы и табы. тоже самое , что и Trim() но если неего удалять возвращетт тот же String
        System.out.println(s4.stripLeading());// удаляет пробелы и табы после символов 
        System.out.println(s4.stripTrailing());// удаляет пробелы и табы перед символами   
    }
}
