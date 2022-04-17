package lesson6;

/**
 * правила для constructor OverLoading аналогичные перегруженным методам method overloading
 *
 *
 * Ключевое слово this:
 *
 * Конструктор не может вызвать внутри себя конструктор по имени класса statement(выражение) this должен быть всегда первым выражением(на первой строке) теле метода
 */
public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

   /* Employee(int id2, String surname2, int age2) {
        this(surname2, age2); // ключевое слово this показывает что мы вызываем 
        id = id2;             // overloading конструктор внутри конструктора
    }

    // Допустим нам необходимо создать работника у которого у которого мы 
    // будем знать только имя и возраст:
    Employee(String surname3, int age3) {

        surname = surname3;
        age = age3;

        // таким образом мы получили overloading constructor
    }

    Employee(int id4, String surname4, int age4, double salary4, String department4) {
        this(id4, surname4, age4);
        salary = salary4;
        department = department4; 

    }
      */
    
    // Но эффективней сделать так:
    
    Employee(int id2, String surname2, int age2){
    this(id2, surname2,age2, 0.0, null);// если параметры вызываемого другого overloaded конструктора 
    }                                   // отсутствуют, вместо них проставляем defoult значения
    
    Employee(String surname3, int age3){
    this(0, surname3, age3, 0.0, null);
    }
    
    Employee(int id4, String surname4, int age4, double salary4, String department4){
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }
}
