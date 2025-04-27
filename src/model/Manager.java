package model;

/**
 * Represents a manager employee who can process payments.
 */
public class Manager extends Employee implements Payable {

    public Manager(int intId, String strName) {
        super(intId, strName, "Manager");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println(getName() + " (Manager) approved a payment of $" + amount);
    }
}
