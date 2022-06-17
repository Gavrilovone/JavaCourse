
package lesson27_Exсeptions;
/**
 * если класс перезаписывает метод из супер класса или имплементирует метод из интерфейса непозволительно добавлять в его сигнатуру
 * новые checked исключения.Можно в сигнатуре метода использовать только исключения из перезаписанного метода супер класса или дочерние 
 * классы данных исключений(тоесть нельзя расширять, если в методе в синатуре указан throws IOException, то в перезаписаном методе нельзя
 * указать throws Exception ) но можно добавлять любые Runtime exceptions
 * 
 * Вышенаписанное правило никаким образом не относится к перезагруженным методам
 * 
 * Конструктор может выбрасывать исключения.Конструктор в своей сигнатуре должен описывать все исключения конструктора супер класса, который он вызывает,
 * может описывать супер классы данных исключений, а так же добавлять новые исключения
 * Конструкторы в выбросе исключений ведут себя противоположно перезаписанным методам, тоесть в дочернем классе в его конструкторе мы в сигнатуре должны указать,
 * что как минимум он может выбрасить исключение такое же как и в конструкторе супер класса, но и более широкий
 */
public class Exceptions_method_overriding_and_overloading_constructors {
    
}
