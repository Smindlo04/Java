

public class PrintBook extends Book
{
    private String author;
    private String title;
    private String ISBN;
    private int NumOfPages;
    private double weight;
    
    public PrintBook(){
        
    }
    
    public PrintBook(String author, String title, String ISBN, int NumOfPages, double weight)
    {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.NumOfPages = NumOfPages;
        this.weight = weight;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getISBN()
    {
        return ISBN;
    }
    
    public int getNumOfPages()
    {
        return NumOfPages;
    }
    
    public double getweight()
    {
        return weight;
    }
    
    public String getSizeDetails()
    {
        String str = String.format("PrintBook: " + title + ", by " + author + ", ISBN: " + ISBN + ", " + NumOfPages + " pages, Weight: " +  weight + "g, ");
        return str;
    }
    
    public String displaySizeInfo(){
        String str = String.format("Printbook:" + title + ", " + NumOfPages + "pages, Weight: " + weight + "g,");
        return str;
    }
    
    public String displayWeight(){
        String str = String.format(author + " : " + weight);
        return str;
    }
}
