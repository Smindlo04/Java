
public class EBook extends Book
{
    private String author;
    private String title;
    private String ISBN;
    private int fileSize;
    
    public EBook(){
        
    }
    
    public EBook(String title, String author, String ISBN, int fileSize)
    {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.fileSize = fileSize;
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
    
    public int getFileSize()
    {
        return fileSize;
    }
    
    public String getSizeDetails()
    {
        String str = String.format(" eBook: " + title + " by " + author + ", ISBN: " + ISBN + ", File Size: " + fileSize + "KB, ");
        return str;
    }
    
    public String displaySizeInfo(){
        String str = String.format("eBook:" + title + ", " + fileSize + "KB,");
        return str;
    }
    
    public String displayWeight(){
        String str = null;
        return str;
    }
    }
