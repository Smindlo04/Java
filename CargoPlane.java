

public class CargoPlane extends AirPlane
{
    private int maxPayload;
    private static int numCargoPlane;
    
    public CargoPlane(){
        numCargoPlane++;
    }
    
    public CargoPlane(String name, String model, int range, int maxPayload){
        super(name, model, range);
        setMaxPayload(maxPayload);
        numCargoPlane++;
    }
    
    public void setMaxPayload(int maxPayload){
        this.maxPayload = maxPayload;
    }
    
    public int getMaxPayload(){
        return maxPayload;
    }
    
    public static int getNumCargo(){
        return numCargoPlane;
    }
    
    @Override
    public String toString(){
        String str = String.format("%s %d tons", super.toString(), maxPayload);
        return str;
    }
}
