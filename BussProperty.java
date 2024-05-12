

public class BussProperty extends Property
{
    private int size;
    private double rent;
    
    public BussProperty(){
        
    }
    
    public BussProperty(String ownerName, String contactNum, int duration, int size, double rent){
        super(ownerName, contactNum, duration);
        this.size = size;
        this.rent = rent;
    }
    
    public int getSize(){
        return size;
    }
    
    public double getRent(){
        return rent;
    }
    
    public double calcMonthRent(){
        double rent = size * 250;
        
        return rent;
    }
    
    public double calcMonthInsurance(){
        double insurance = calcMonthRent() * 0.1;
        
        return insurance;
    }
    
    @Override
    public String toString(){
        String str = String.format("%s %-15d %-15.2f", super.toString(), size, rent);
        return str;
    }
}
