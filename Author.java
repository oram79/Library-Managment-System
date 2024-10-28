// Author Class //

import java.util.ArrayList;

public class Author {
    private String name;
    private String dateOfBirth;
    private ArrayList<LibraryItem> writtenItems; // List of library items this author has written //

    // Constructor //
    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.writtenItems = new ArrayList<>();
    }

    // Getters and Setters for name and dateOfBirth //
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    // Add a written item to the author's list //
    public void addItem(LibraryItem item) {
        writtenItems.add(item);
    }

    // Display the author details and the items they've written //
    public void displayAuthorDetails() {
        System.out.println("Author:" + name + ", Date of Birth: " + dateOfBirth);
        System.out.println("Written Items:");
        for (LibraryItem item : writtenItems) {
            item.displayDetails();
        }
    }
}

