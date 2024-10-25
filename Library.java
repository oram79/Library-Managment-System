import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items;
    private ArrayList<Author> authors;
    private ArrayList<Patron> patrons;

    public Library() {
        this.items = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void borrowedItem(String title, Patron patron) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title) && item.getNumberOfCopies() > 0) {
                patron.borrowedItems(item);
                item.setNumberOfCopies(item.getNumberOfCopies() - 1);
                System.out.println(title + " Has Been Borrowed By " + patron.getName());
                return;
            }
        }
        System.out.println("Item Not Available");
    }
