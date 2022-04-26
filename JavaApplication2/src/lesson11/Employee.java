
package lesson11;


public class Employee {
    public String name;
    public double salary;
    
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    
    public double uvelichitel(double a){
        a = a*2;
        return a;
    }
    
    public double uvelichitelZP(){
        salary = salary*2;
        return salary;
    }
}
