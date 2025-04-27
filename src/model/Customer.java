package model;

/**
 * Represents a customer who can reserve tables.
 */
public class Customer implements Reservable {
    private int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    @Override
    public void reserveTable(int tableNumber) {
        System.out.println(name + " reserved table number " + tableNumber + ".");
    }
}
