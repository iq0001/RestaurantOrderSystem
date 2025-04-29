import model.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String customerName = "";
        boolean validName = false;

        // 1. Ask for customer's name (protected)
        while (!validName) {
            System.out.print("Welcome to the Restaurant! May I have your name please? ");
            customerName = scanner.nextLine();

            if (customerName.matches(".*\\d.*")) { // If the name contains a number
                System.out.println("Invalid input. Names cannot contain numbers. Please enter your name correctly.");
            } else {
                validName = true;
            }
        }

        // 2. Ask for number of guests (protected)
        int numberOfGuests = 0;
        boolean validGuests = false;

        while (!validGuests) {
            try {
                System.out.print("How many guests will be attending, " + customerName + "? ");
                numberOfGuests = scanner.nextInt();
                validGuests = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number of guests.");
                scanner.next(); // clear wrong input
            }
        }

        // 3. Ask for number of tables (protected)
        int numberOfTables = 0;
        boolean validTables = false;

        while (!validTables) {
            try {
                System.out.print("How many tables would you like to reserve, " + customerName + "? ");
                numberOfTables = scanner.nextInt();
                validTables = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number of tables.");
                scanner.next(); // clear wrong input
            }
        }

        System.out.println("\nThank you, " + customerName + "! " + numberOfGuests + " guests and " + numberOfTables + " tables reserved.");

//        // --- Your original working code continues normally ---
//
//        // Create Employees (Waiter and Manager)
//        Waiter waiter1 = new Waiter(101, "Alice");
//        Manager manager1 = new Manager(201, "Bob");
//
//        waiter1.login();
//        manager1.login();
//
//        waiter1.logout();
//        manager1.logout();
//
//        // Create Customer and reserve a table
//        Customer customer1 = new Customer(301, customerName);
//        customer1.reserveTable(5);
//
//        // Create MenuItems and an Order
//        MenuItem burger = new MenuItem("Burger", 10.99);
//        MenuItem fries = new MenuItem("Fries", 4.99);
//        MenuItem drink = new MenuItem("Soft Drink", 2.50);
//
//        Order order1 = new Order(401);
//        order1.addItem(burger);
//        order1.addItem(fries);
//        order1.addItem(drink);
//
//        System.out.println("Total for Order #" + order1.getOrderId() + ": $" + order1.calculateTotal());
//
//        // Waiter processes the payment
//        waiter1.processPayment(order1.calculateTotal());
    }
}
