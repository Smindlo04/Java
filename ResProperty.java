

public class ResProperty extends Property
{
    private char type;
    private int numBedrooms;
    private int numBathrooms;
    private int numGarage;
    private double rentPerMonth;
    
    public ResProperty(){
        
    }
    
    public ResProperty(String ownerName, String contactNum, int duration, char type, int numBedrooms){
        super(ownerName, contactNum, duration);
        this.type = type;
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
    }
    
    public char getType(){
        return type;
    }
    
    public int getnumBedrooms(){
        return numBedrooms;
    }
    
    public int getnumBathrooms(){
        return numBathrooms;
    }
    
    public double calcMonthRent(){
        int base = 0;
        int additional = 0;
        
        switch(Character.toUpperCase(type)){
            case 'F':
                base = 8000;
                additional = numBedrooms * 500;
                break;
            case 'T':
                base = 15000;
                additional = numBedrooms * 1000;
                break;
            case 'H':
                base = 12000;
                additional = numBedrooms * 800;
                break;
            default:
                base = 0;
                additional = 0;
                break;
        }
        
        double rent = base + additional;
        
        return rent;
    }
    
    @Override
    public String toString(){
        String str = String.format("", super.toString(), type, numBedrooms, numBathrooms);
        return str;
    }
}
