package model;

/**
 * Represents a table in the restaurant.
 */
public class Table {
    private int tableNumber;
    private int capacity;
    private boolean reserved;

    public Table(int tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.reserved = false; // default: not reserved
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void reserve() {
        this.reserved = true;
        System.out.println("Table " + tableNumber + " has been reserved.");
    }

    public void cancelReservation() {
        this.reserved = false;
        System.out.println("Reservation for table " + tableNumber + " has been cancelled.");
    }
}
