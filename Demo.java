import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Preload some sample data
        preloadData(library);

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
}
