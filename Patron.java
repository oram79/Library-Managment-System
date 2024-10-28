// Patron.java //

import java.util.ArrayList;

public abstract class Patron {
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<LibraryItem> borrowedItems; // List of borrowed library items //

    // Constructor //
    public Patron(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedItems = new ArrayList<>();
    }

    // Getters and Setters for Patron's attributes //
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    // Methods to manage borrowed items //
    public void borrowedItems(LibraryItem item) {
        borrowedItems.add(item);
    }

    public void returnItem(LibraryItem item) {
        borrowedItems.remove(item);
    }

    // Abstract method for displaying patron details (implemented in subclasses) //
    public abstract void displayPatronDetails();
}
