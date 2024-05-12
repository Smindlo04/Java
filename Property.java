

public abstract class Property implements Propertyable
{
    private char type;
    private String ownerName;
    private String contactNum;
    private int duration;
    
    public Property(){
        
    }
    
    public Property(String ownerName, String contactNum, int duration){
        this.ownerName = ownerName;
        this.contactNum = contactNum;
        this.duration = duration;
    }
    
    public String getownerName(){
        return ownerName;
    }
    
    public String getcontactNum(){
        return contactNum;
    }
    
    public int getduration(){
        return duration;
    }
    
    @Override
    public String toString(){
        String str = String.format("%-15s %-15s %-15d", ownerName, contactNum, duration);
        return str;
    }
}
