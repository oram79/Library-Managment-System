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

    public abstract void displayDetails();
}
