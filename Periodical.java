// Periodical.java

public class Periodical extends LibraryItem {
    private String periodicalType; // Printed or Electronic

    // Constructor
    public Periodical(String id, String title, String author, String isbn, String publisher, int numberOfCopies, String periodicalType) {
        super(id, title, author, isbn, publisher, numberOfCopies);
        this.periodicalType = periodicalType;
    }

    // Getter and Setter for periodicalType
    public String getPeriodicalType() { return periodicalType; }
    public void setPeriodicalType(String periodicalType) { this.periodicalType = periodicalType; }

    
    public String toString() {
    return "Periodical Title: " + this.getTitle() + ", Issue: " + this.periodicalType;
}

    @Override
    public void displayDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayDetails'");
    }

}
