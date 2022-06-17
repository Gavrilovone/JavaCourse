
package lesson27_Exсeptions;
/**
 * ExceptionINInitializerError - является наследником LinkageError и выбрасвается тогда , когда в статических initializer-ах выбрасывается RuntimeException
 * то-есть если в статических методах или когда вообще работаем со static контекстом и выбрасывается RuntimeException, то выбросится ExceptionINInitializerError
 * 
 * StackOverflowError - рассматривался в примере с рекурсией, является наследником VirtualMachineError
 * OutOfMemoryError - так же является наследником VirtualMachineError  и выбрасывается тогда, когда JVM не способна более создавать новые объекты,
 * потому, что не осталось памяти свободной
 * 
 * NoClassDefFoundError - является наследником LinkageError,  выбрасывается когда java не может найти какой-нибудь класс во время runtime(dj время запуска программы)
 */

public class Classes_error {
    
}
