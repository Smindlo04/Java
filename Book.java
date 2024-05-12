import java.util.*;
import java.io.*;
import java.util.Arrays;

public abstract class Book implements IBook
{
    public static void main(String[] args){
       
        FileClass file = new FileClass();
        file.readFromFile();
        IBook[] arrBooks = file.getArray();
        System.out.println(arrBooks);
        
        
        int counter = file.getCount();
        displayAllBooks(arrBooks, counter);
        displaySizeP(arrBooks, counter);
        displaySizeE(arrBooks, counter);
        displayWeightInfo(arrBooks, counter);
        //displayEBook(arrBooks, counter);
        //displayPrintBook(arrBooks, counter);
    }
    
    public static void displayAllBooks(IBook[] arrBooks, int counter)
    {
        System.out.println("All Books");
        displayEBook(arrBooks, counter);
        displayPrintBook(arrBooks, counter);
    }
    
   
    public static void displayEBook(IBook[] arrBooks, int counter){
        
        
        for(int i = 0; i < counter; i++){
            if(arrBooks[i] instanceof PrintBook){
                System.out.printf("%-15s\n", arrBooks[i].getSizeDetails());
            }
        }
    }
    
    public static void displayPrintBook(IBook[] arrBooks, int counter){
        
        for(int i = 0; i < counter; i++){
            if(arrBooks[i] instanceof EBook){
                System.out.printf("%-15s\n", arrBooks[i].getSizeDetails());
            }
        }
    }
    
    public static void displaySizeP(IBook[] arrBooks, int counter){
        System.out.println("\nSize Information");
        
        for(int i = 0; i < counter; i++){
            if(arrBooks[i] instanceof PrintBook){
                System.out.printf("%-15s\n", arrBooks[i].displaySizeInfo());
            }
        }
    }
    
    public static void displaySizeE(IBook[] arrBooks, int counter){
        System.out.println("\nSize Information");
        
        for(int i = 0; i < counter; i++){
            if(arrBooks[i] instanceof EBook){
                System.out.printf("%-15s\n", arrBooks[i].displaySizeInfo());
            }
        }
    }
    
    public static void displayWeightInfo(IBook[] arrBooks, int counter){
        System.out.println("\n\nWeight of PrintBooks");
        
        for(int  i =0; i < counter; i++){
            if(arrBooks[i] instanceof PrintBook){
                System.out.printf("%-15s\n", arrBooks[i].displayWeight());
            }
        }
        
    }
    }





