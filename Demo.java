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
            System.out.println("Enter Your Choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
