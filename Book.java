public class Book extends LibraryItem {
    private String format;

    public Book(String id, String title, String author, String isbn, String publisher, int numOfCopies, String format)
    {
        super(id, title, author, isbn, publisher, numOfCopies);
        this.format = format;
    }
    
    public void displayDetails() {
        System.out.println("Book [Title:] " + this.getTitle() + ", Author:" + this.author() + ", Format: " + this.format + "]");
    }
}