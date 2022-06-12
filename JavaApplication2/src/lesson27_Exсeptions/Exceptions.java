
package lesson27_Exсeptions;
/**
 * Java позволяет нам разграничить два понятия, код который должен выполняться при нормальной работе программы и код который будет выполнятся при 
 * выбросе какого-то исключения
 * После выброса exception java прекращает выполнение программы, но мы можем обработать exceptions так, чтобы java продолжила работу
 * Так как Java это ООП язык, то и exceptions тоже являются объектами
 * конструкторы FileInputStreaam и FileOutputStreaam могут выбрасывать исключение FileNotFoundException (такого файла не существует) если 
 * в конструкторе нашего потока нет файла который мы указываем
 * методы read и write FileInputStreaam и FileOutputStreaam могут выбрасывать исключение IOExceptions(если создается какое то припятствие для чтения или записи)
 * например  будем читать с помощью цикла по одному чару текст и в процессе выполнения пока еще все не прочитано закроем поток
 * IOExceptions является supeк классом FileNotFoundException (тоесть он более общий обширный)
 * 
 * Иерархия классов:
 * на самом верху естественно класс Object 
 * существует класс Throwable(переводится как способный быть выброшен) который происходит от класса Object и является его прямым потомком
 * у класса Throwable есть subклассы:
 * 1.Exception
 * 2.Error
 * у них есть свои subклассы свои errors и exceptions(то же IOExceptions является subклассом Exception)
 * одним из самых важных sub классов Exception является RunTimeException, у него тоже есть свои sub классы
 */

public class Exceptions {
    
}
