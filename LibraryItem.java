// LibraryItem.java //

public abstract class LibraryItem {
    private String id;
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private int numOfCopies;

    public LibraryItem(String id, String title, String author, String isbn, String publisher, int numOfCopies)
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.numOfCopies = numOfCopies;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }

    public int getNumberOfCopies() { return numOfCopies; }
    public void setNumberOfCopies(int numberOfCopies) { this.numOfCopies = numberOfCopies; }


    public abstract void displayDetails();
}
