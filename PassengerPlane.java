

public class PassengerPlane extends AirPlane
{
    private int numOfPassengers;
    private static int numPassengerPlane;
    
    public PassengerPlane(){
        numPassengerPlane++;
    }
    
    public PassengerPlane(String name, String model, int range, int numOfPassengers){
        super(name, model, range);
        setPassengers(numOfPassengers);
        numPassengerPlane++;
    }
    
    public void setPassengers(int passengers){
        this.numOfPassengers = passengers;
    }
    
    public int getNumOfPassengers(){
        return numOfPassengers;
    }
    
    public static int numPassengerPlane(){
        return numPassengerPlane;
    }
    
    @Override
    public String toString(){
        String str = String.format("%s %d", super.toString(), numOfPassengers);
        return str;
    }
}
