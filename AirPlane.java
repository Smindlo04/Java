

public class AirPlane
{
    private String name;
    private String model;
    private int range;
    
    public AirPlane(){}
    
    public AirPlane(String name, String model, int range){
        this.name = name;
        this.model = model;
        this.range = range;
    }
    
    public String getName(){
        return name;
    }
    
    public String getModel(){
        return model;
    }
    
    public int getRange(){
        return range;
    }
    
    @Override
    public String toString(){
        String str = String.format("%s %s %d", name, model, range);
        return str;
    }
}
