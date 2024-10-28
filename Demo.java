import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Infinite loop for the menu system
        while (true) {
            System.out.println("\n--- Logan's Library System ---");
            System.out.println(" 1. Add Library Item ");
            System.out.println(" 2. Add Author ");
            System.out.println(" 3. Add Patron ");
            System.out.println(" 4. Borrow Item ");
            System.out.println(" 5. Return Item ");
            System.out.println(" 6. Display Library Items ");
            System.out.println(" 7. Display Patrons ");
            System.out.println(" 8. Exit ");
            System.out.println(" Enter Your Choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addLibraryItem(library, scanner);
                    break;
                case 2:
                    addAuthor(library, scanner);
                    break;
                case 3:
                    addPatron(library, scanner);
                    break;
                case 4:
                    borrowItem(library, scanner);
                    break;
                case 5:
                    returnItem(library, scanner);
                    break;
                case 6:
                    displayLibraryItems(library);
                    break;
                case 7:
                    displayPatrons(library);
                    break;
                case 8:
                    System.out.println("Closing The System...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println(" Invalid Choice. Please Try Again ");
            }
        }
    }

    // Method To Add A Libary Item //
    private static void addLibraryItem(Library library, Scanner scanner){
        System.out.println(" Enter Type Of Item (Book/Periodical): ");
        String type = scanner.nextLine();

        System.out.print(" Enter ID: ");
        String id = scanner.nextLine();
        System.out.println(" Enter Title: ");
        String title = scanner.nextLine();
        System.out.println(" Enter Author: ");
        String author = scanner.nextLine();
        System.out.println(" Enter ISBN: ");
        String isbn = scanner.nextLine();
        System.out.println(" Enter Publisher Name: ");
        String publisher = scanner.nextLine();
        System.out.println(" Enter Number Of Copies: ");
        int numberOfCopies = scanner.nextInt();
        scanner.nextLine();

        if (type.equalsIgnoreCase("Book")) {
            System.out.print("Enter Format (Printed/Electronic/Audio): ");
            String format = scanner.nextLine();
            Book book = new Book(id, title, author, isbn, publisher, numberOfCopies, format);
            library.addItem(book);
        } else if (type.equalsIgnoreCase("Periodical")) {
            System.out.print("Enter Type (Printed/Electronic): ");
            String periodicalType = scanner.nextLine();
            Periodical periodical = new Periodical(id, title, author, isbn, publisher, numberOfCopies, periodicalType);
            library.addItem(periodical);
        } else {
            System.out.println("Invalid Item Type.");
        }

        System.out.println(" Library Item Added Successfully! ");
    }

    // Method To Add A Author //
    private static void addAuthor(Library library, Scanner scanner) {
        System.out.println(" Enter Author Name: ");
        String name = scanner.nextLine();
        System.out.println(" Enter Date Of Birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();

        Author author = new Author(name, dob);
        library.addAuthor(author);

        System.out.println(" Author Added Successfully! ");
    }

    // Method to add a patron
    private static void addPatron(Library library, Scanner scanner) {
        System.out.print(" Enter Patron Type (Student/Employee): ");
        String type = scanner.nextLine();
        System.out.print(" Enter Name: ");
        String name = scanner.nextLine();
        System.out.print(" Enter Address: ");
        String address = scanner.nextLine();
        System.out.print(" Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        if (type.equalsIgnoreCase(" Student ")) {
            System.out.print(" Enter Student ID: ");
            String studentID = scanner.nextLine();
            Patron student = new Student(name, address, phoneNumber, studentID);
            library.addPatron(student);
        } else if (type.equalsIgnoreCase(" Employee ")) {
            System.out.print(" Enter Employee ID: ");
            String employeeID = scanner.nextLine();
            Patron employee = new Employee(name, address, phoneNumber, employeeID);
            library.addPatron(employee);
        } else {
            System.out.println(" Invalid Patron Type ");
        }

        System.out.println(" Patron Added Successfully! ");
    }
}