
package lesson21_PovtorenyeMelochey;


public class GarbageCollection {
    
    // Метод System.gc() - мы как бы предлогаем garbage collector , что сейчас самое благоприятное время для удаления. но java
    // запросто может проигнорировать
    // метод finalize() вызывается garbage collector ом на объект, когда garbage collector понял, что объект может быть удален.
    // т.е. без garbage collectora метод finalize() не будет вызван. если garbage collector по какой-то причине не сможет удалить
    // какой-то объект, то второй раз метод finalize() вызван не будет. он не вызывается для одного и того же объекта дважды
}
