import model.*;

public class Main {
    public static void main(String[] args) {


        //Create Employees (Waiter and Manager) and show inheritance
        Waiter waiter1 = new Waiter(101, "Alice");
        Manager manager1 = new Manager(201, "Bob");

        waiter1.login();
        manager1.login();

        waiter1.logout();
        manager1.logout();


        //Create Customer and reserve a table
        Customer customer1 = new Customer(301, "Charlie");
        customer1.reserveTable(5);


        //Create MenuItems and an Order
        MenuItem burger = new MenuItem("Burger", 10.99);
        MenuItem fries = new MenuItem("Fries", 4.99);
        MenuItem drink = new MenuItem("Soft Drink", 2.50);

        Order order1 = new Order(401);
        order1.addItem(burger);
        order1.addItem(fries);
        order1.addItem(drink);


        System.out.println("Total for Order #" + order1.getOrderId() + ": $" + order1.calculateTotal());

        //Waiter processes the payment
        waiter1.processPayment(order1.calculateTotal());





    }
}
