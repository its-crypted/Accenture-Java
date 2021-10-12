public class 1_Book{
    
    private String bookName;
    private int bookPrice;
    private String authorName;
    
    //setters
    
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    
    public void setBookPrice(int bookPrice){
        this.bookPrice = bookPrice;
    }
    
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }
    
    //getters
    
    public String getBookName(){
        return this.bookName;
    }
    
    public int getBookPrice(){
        return this.bookPrice;
    }
    
    public String getAuthorName(){
        return this.authorName;
    }
}
