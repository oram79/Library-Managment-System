
public class Book extends LibraryItem {
    private String format; // Printed, Electronic, Audio

    // Constructor
    public Book(String id, String title, String author, String isbn, String publisher, int numberOfCopies, String format) {
        super(id, title, author, isbn, publisher, numberOfCopies);  // Calls the constructor of LibraryItem
        this.format = format;
    }

    // Getter and Setter for format
    public String getFormat() { return format; }
    public void setFormat(String format) { this.format = format; }

    
    public String toString() {
    return "Book Title: " + this.getTitle() + ", Author: " + this.getAuthor() + ", ISBN: " + this.getIsbn();
}

    @Override
    public void displayDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayDetails'");
    }

}
