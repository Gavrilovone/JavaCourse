
package lesson21_PovtorenyeMelochey;


public class Import__ConflictImen {
    
    /* Если у нас есть 2 пакета  
    
    package p1     и     package p2
    class A               class A
    
    ackage p3
    import p1.A;
    import p2.A;    
     
    class B{
    если захотим использовать короткое имя А:
    java не поймет к какому классу A нужно обратиться. так нельзя! конфликт имен 
    }
    
    package p3
    import p1.*; компилятор не будет ругаться
    import p2.*;  
    class B{
    A a = new A() но - тут опять java не поймет к какому классу A нужно обратиться
    }
    
    package p3
    import p1.A;  иморт на прямую
    import p2.*;  импорт пакетом
    class B{
    A a = new A() - тут опять java сначала будет обращяться к классу 
    который импортирован на прямую
                                      }
    
    Но правильно делать так: 
    package p3
    import p1.*;  
    import p2.*;  
    class B{
    p1.A a = new p1.A() - с помощью полного имени чтобы небыло путанницы
    p2.A a = new p2.A()
                                      }
    
    import java.*; не является ошибочным, но он ничего не импортирует нам
    потому, что чтобы импортировать какой-то класс, ножно как минимум после точки указать его subclass
    
    
    
    
    
    
*/
}
