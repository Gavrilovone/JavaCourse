
package HomeWork.lesson4;

public class Student {
    
        int studentNumder;
        String name;
        String surName;
        int yearOfStudy;
        int mathAverage;
        int economicsAverage;
        int languadgeAverage;
        int resultAverage;
        
 }
        class StudentTest {
        public static void main(String[] args) {

        Student Student1 = new Student();
        Student Student2 = new Student();
        Student Student3 = new Student();
        
        Student1.languadgeAverage = 4;
        Student1.mathAverage = 5;
        Student1.economicsAverage =5;
        Student1.resultAverage = (Student1.languadgeAverage+Student1.mathAverage+Student1.economicsAverage)/3;
        Student1.name = "Alexey";
        Student1.surName ="Gavrilov";
        
        Student2.languadgeAverage = 3;
        Student2.mathAverage = 3;
        Student2.economicsAverage =5;
        Student2.resultAverage = (Student2.languadgeAverage+Student2.mathAverage+Student2.economicsAverage)/3;
        Student2.name = "Ivan";
        Student2.surName ="Petrov";
                     
                       
        Student3.languadgeAverage = 3;
        Student3.mathAverage = 3;
        Student3.economicsAverage =5;
        Student3.resultAverage = (Student3.languadgeAverage+Student3.mathAverage+Student3.economicsAverage)/3;
        Student3.name = "Sergey";
        Student3.surName = "Gavrilov";
                     
        
                 System.out.println("Средняя оценка студента  "+Student1.name +" "+ Student1.surName +" = " + Student1.resultAverage);
                 System.out.println("Средняя оценка студента  "+Student2.name +" "+ Student2.surName +" = " + Student2.resultAverage);
                 System.out.println("Средняя оценка студента  "+Student3.name +" "+Student3.surName +" = " + Student3.resultAverage);
         }
}
        
         
     