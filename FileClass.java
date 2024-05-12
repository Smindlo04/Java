import java.io.*;
import java.util.*;
import javax.swing.*;


public class FileClass
{
    int counter = 0;
    IBook []arrBooks = new IBook[25];
    
    
    public void readFromFile(){
        try{
            Scanner input = new Scanner(new FileReader("books.txt"));
            
            while(input.hasNextLine()){
                String line = input.nextLine();
                String[] data = line.split("#");
                String title = data[0];
                String author = data[1];
                String ISBN = data[2];
                int NumOfPages;
                double weight;
                int fileSize;
                
                char ISBNChar = ISBN.charAt(0);
                if(ISBNChar == '0')
                {
                
                NumOfPages = Integer.parseInt(data[3]);
                weight = Float.parseFloat(data[3] +1);
                arrBooks[counter] = new PrintBook(title, author, ISBN, NumOfPages,weight);
                counter++;
                }
                else
                {
                    
                fileSize = Integer.parseInt(data[3]);
                arrBooks[counter] = new EBook(title, author, ISBN, fileSize);
                counter++;
            }
               
                
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error reading from file !!");
        }
    }
    
    public int getCount(){
        return counter;
    }
    
    public IBook[] getArray(){
        return arrBooks;
    }
}
