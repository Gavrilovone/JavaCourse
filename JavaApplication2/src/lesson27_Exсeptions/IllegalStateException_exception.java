
package lesson27_Exсeptions;


public class IllegalStateException_exception {
    
}
class AirPlane{
    String condition = "penfing";// в ожидании
    
    public void flies(){ // метод flies меняет состояние "в ожидании" на "в воздухе" и пишет саомлет летит
    condition = "In the air"; 
        System.out.println("AirPlane flies"); // самолет летит
    }
    
    public void pending(){
        /**
         * метод pending сначала проверяет если самолет в воздухе, тогда выбрасывай исключение, потому что в этом случае
         * вызов метода ожидать абсолютно не в тему, как он может попасть в ожидание если он летит
         */
        if(condition.equals("In the air")){
        throw new IllegalStateException("the plane is already in the air");
        }
        condition = "penfing";
        System.out.println("airplane waiting to fly");
    }
    
    public void flightCancellation(){ // отмена полета
    if(condition.equals("In the air")){
        throw new IllegalStateException("the plane is already in the air");
        }
    condition = "flight canceled"; // полет отменен
        System.out.println("flight airplane canceled");
    }
    
    public static void main(String[] args) {
        AirPlane a = new AirPlane();
        a.pending(); // airplane waiting to fly
        a.flies(); // AirPlane flies
        a.flightCancellation(); // выбросится исключение IllegalStateException: the plane is already in the air
        
    }
}