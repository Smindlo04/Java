import java.util.Scanner;

public class testPlane
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int maxPayload;
        
        AirPlane[] arrPlane = new AirPlane[15];
        arrPlane = fillArray(arrPlane);
        display(arrPlane);
        
        System.out.print("\n\n\nEnter the payload you wish to display: ");
        maxPayload = sc.nextInt();
        checkMaxPayload(arrPlane, maxPayload);
    }
    
    public static void checkMaxPayload(AirPlane[] arrPlane, int maxPayload){
        int size = CargoPlane.getNumCargo() + PassengerPlane.numPassengerPlane();
        
        for(int i = 0; i < size; i++){
            if(arrPlane[i] instanceof CargoPlane){
                if(arrPlane[i] != null){
                    int payload = ((CargoPlane)arrPlane[i]).getMaxPayload();
                    
                    if(payload >= maxPayload){
                        System.out.printf("%d %s", i + 1, arrPlane[i].toString());
                    }
                }
            }
        }
    }
    
    public static void display(AirPlane[] arrPlane){
        int size = PassengerPlane.numPassengerPlane() + CargoPlane.getNumCargo();
        
        //Plane   Model   Range   MaxPayload/Ton
        for(int i = 0; i < size; i++){
            System.out.printf("%d %s\n", i + 1, arrPlane[i].toString());
        }
    }
    
    public static AirPlane[] fillArray(AirPlane[] arrPlane){
        Scanner sc = new Scanner(System.in);
        String name;
        String model;
        int range;
        int numOfPassengers;
        int maxPayload;
        int count = 0;
        int choice;
        
        System.out.print("Passenger[1] | Cargo[2] | Exit[0]: ");
        choice = sc.nextInt();
        
        while(count < 15 && choice != 0){
            System.out.print("Enter the name of the plane: ");
            name = sc.next();
            
            System.out.print("Enter the model name: ");
            model = sc.next();
            
            System.out.print("Enter the range: ");
            range = sc.nextInt();
            
            if(choice == 1){
                System.out.print("Enter the number of passengers: ");
                numOfPassengers = sc.nextInt();
                
                arrPlane[count] = new PassengerPlane(name, model, range, numOfPassengers);
                count++;
            }
            else if(choice == 2){
                System.out.print("Enter max payload: ");
                maxPayload = sc.nextInt();
                
                arrPlane[count] = new CargoPlane(name, model, range, maxPayload);
                count++;
            }
            else{
                System.out.print("Incorrect input, please try again!!!");
            }
            
        }
        System.out.print("Passenger[1] | Cargo[2] | Exit[0]");
        choice = sc.nextInt();
        
        return arrPlane;
    }
}
