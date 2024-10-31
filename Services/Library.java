package Services;

// Library.java //

import java.util.ArrayList;

import Models.Author;
import Models.LibraryItem;
import Models.Patron;

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

    // Method to get a patron by name //
    public Patron getPatronByName(String name) {
        for (Patron patron : patrons) {
            if (patron.getName().equalsIgnoreCase(name)) {
                return patron;
            }
        }
        return null; // Return null if no patron with the given name is found //
    }

    // Method to return an item //
    public void returnItem(String title, Patron patron) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.setNumberOfCopies(item.getNumberOfCopies() + 1); // Increment the number of copies //
                System.out.println(title + " has been returned by " + patron.getName());
                return;
            }
        }
        System.out.println("Item not found");
    }

    // Method to display all library items //
    public void displayAllItems() {
        for (LibraryItem item : items) {
            System.out.println(item);
        }
    }

    // Method to display all patrons //
    public void displayAllPatrons() {
        for (Patron patron : patrons) {
            System.out.println(patron);
        }
    }
}

