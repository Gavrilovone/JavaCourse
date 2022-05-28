/**
 * Метод hiding это перекрытие static методов из parent класса в subклассе
 * методы считаются hidden(скрытыми) если:
 * - имя subrклассе такое же как и в parent классе
 * - список аргументов такой же как и в parent классе
 * - return type в parent классе такой же, что и в parent классе. либо return type в sub
 * - классе это sub класс return type из parent класса(covariant return type) ковариантный. т.е. все sub классы
 * - access modifier в sub классе должен быть такой же или менее строгий чем в parent классе
 * - если в parent классе метод является static,  то и для sub  класса он должен быть static 
 * - Variable hidding обявление в subклассе переменной с таким же именем(необязательно типом) как и в parent классе 
 * 
 * Если статичный метод в парент классе сделать final , то hide тоже невозможен
 */
package lesson23_Overriding_Hiding_Final;


public class Hidng {
    
}
