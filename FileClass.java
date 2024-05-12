import java.util.*;
import java.io.*;

public class FileClass
{
    private int counter = 0;
    
    ArrayList<Propertyable> arrProperty = new ArrayList<Propertyable>();
    
    public void readFromFile(){
        try{
            Scanner input = new Scanner(new FileReader("properties.txt"));
            
            while(input.hasNext()){
                String line = input.nextLine();
                String[] data = line.split(" ");
                String ownerName;
                String contactNum;
                int duartion;
                int size;
            }
        }
        catch(IOException e){
            
        }
    }
}
