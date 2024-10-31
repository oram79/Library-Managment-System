package Models;

// Student.java //

public class Student extends Patron {
    private String studentID;

    // Constructor //
    public Student(String name, String address, String phoneNumber, String studentID) {
        super(name, address, phoneNumber);
        this.studentID = studentID;
    }

    public String toString() {
    return "Student Name: " + this.getName() + ", ID: " + this.studentID + ", Address: " + this.getAddress() + ", Phone Number: " + this.getPhoneNumber();
}

    @Override
    public void displayPatronDetails() {
        throw new UnsupportedOperationException("Unimplemented method 'displayPatronDetails'");
    }

}

