// Employee Class

public class Employee extends Patron {
    private String employeeID;

    // Constructor
    public Employee(String name, String address, String phoneNumber, String employeeID) {
        super(name, address, phoneNumber);
        this.employeeID = employeeID;
    }

    @Override
    public void displayPatronDetails() {
        System.out.println("Employee [Name: " + this.getName() + ", Employee ID: " + employeeID + "]");
    }
}

