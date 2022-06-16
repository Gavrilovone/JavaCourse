
package lesson27_Exсeptions;
import java.util.*;

public class ClassCastException {
    public static void main(String[] args) {
        Doctor d = new Doctor(); 
        Teacher t = new Teacher();
        Employee [] array1 = {d, t};
        Teacher t2 = (Teacher)array1[0]; 
        /**
         * вылетит исключене ClassCastException Doctor не может быть cast в Teacher, хотя поидее Teacher может быть Employee, 
         * но конкретно нулевой элемент массива доктор 
         */
    }
}

class Employee{}
class Doctor extends Employee{}
class Teacher extends Employee{}