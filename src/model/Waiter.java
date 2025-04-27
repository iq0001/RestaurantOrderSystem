package model;

/**
 * Represents a waiter employee who can process payments.
 */
public class Waiter extends Employee implements Payable {

    public Waiter(int intId, String strName) {
        super(intId, strName, "Waiter");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println(getName() + " processed a payment of $" + amount);
    }
}
