
package lesson27_Exсeptions;

public class Creating_exception {
    /**
     * TosprainAFoot(подвернуть ногу)
     * CrumpledMuscle(свело мышцу)
     * runningPace(темп бега)
     */
}
class Test14{
    void marathon(int airTemperature, int runningPace) throws TosprainAFootException {
        /**
         * так как это checked exception, мы должны либо указать в сигнатуре, что он может быть выброшен, либо заключить его в try, в данном случае в сигнатуре
         */
        if(runningPace > 12){ // если темп бега больше 12 
            throw new TosprainAFootException("Тем бега был слишком высокийм: " + runningPace); // выбрасывай исключение(можем указать message, можем не указывать)
        }
        if(airTemperature > 32){
            throw new CrumpledMuscleException(); 
            /**
             * из-затого что данный exception подсемейства runtime, мы можем не указывать в сигнатуре о возможности его выброса
             * и не ловить его
             */
                
        }
        System.out.println("Вы пробежали марафон"); // если exception не выбрасывается
    }
    
    public static void main(String[] args) {
        Test14 t = new Test14();
        try{
            t.marathon(40, 10);
        }
        catch(TosprainAFootException e){
            System.out.println(e.getMessage()); // выводи его message на экран
        }
        
        /**
         * компилятор говорит, что данный метод выбрасывает exception и по-этому сдесь в main методе так же нужно указать в сигнатуре о возможности
         * его выброса или поймать его, в данном случае поймаем его
         */
        
        finally{
            System.out.println("В любом случае вы получите грамоту");
        }
    }
}


class TosprainAFootException extends Exception{ // checked exception
    /**
     * у Exception, RuntimeException есть конструкторы которые принимают параметр String, есть которые не принимают ничего
     * String параметр в данном случае будет вступать как послание как message который exception несет собой 
     */
    
    TosprainAFootException(String message){
        super(message); // передаем message конструктору super класса
        /**
         * тоесть у его супер класса Exception есть такой конструктор который принимает String параметр и при созданиии
         * объекта TosprainAFootException мы будем указывать какой-нибудь message, а если не захотим, то никакой mrssage
         * указывать не будем, поэтому создаем еще один конструктор:
         */ 
    }
    
    TosprainAFootException(){}
}

class CrumpledMuscleException extends RuntimeException{ // unchecked exception
    
    CrumpledMuscleException(String message){
        super(message);
    }
    CrumpledMuscleException(){}

}

/**
 * output:
 * t.marathon(20, 15):
                       Тем бега был слишком высокийм: 15
                       В любом случае вы получите грамоту
   t.marathon(40, 10):
                       В любом случае вы получите грамоту
                       Exception in thread "main" lesson27_Exсeptions.CrumpledMuscleException
                       at lesson27_Exсeptions.Test14.marathon(Creating_exception.java:20)
                       at lesson27_Exсeptions.Test14.main(Creating_exception.java:33)
                       C:\Users\User\AppData\Local\NetBeans\Cache\13\executor-snippets\run.xml:111: The following error occurred while executing this line:
                       C:\Users\User\AppData\Local\NetBeans\Cache\13\executor-snippets\run.xml:68: Java returned: 1

 */