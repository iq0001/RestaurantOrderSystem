package model;

/**
 * Represents a menu item in the restaurant.
 */
public class MenuItem {
    private String itemName;
    private double price;

    public MenuItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
}
