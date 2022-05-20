/*
   задача написать метод, который принимает в параметр массив и выводит на экран его
   наибольший и наименьший элемент.
 */
package lesson18__Array;

public class Array_method_max_min {

    public static void maxMin(double[] array) {
        double max = array[0]; // изначально равны первому элементу массива
        double min = array[0];

        for (int i = 1; i < array.length; i++) { // i = 1, так как мы нулевое значение и так и так присвоили max и min
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println("Минимальный элемент массива " + min + " Максимальный элемент массива "+ max);
    }
    
    public static void main(String[] args) {
        double[] array = new double[]{1.2,6.9,8,-6.2}; 
        
        maxMin(array);
        maxMin(new double[]{2.5, 4, 1, 5});
        
    }
}
