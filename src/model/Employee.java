package model;

/**
 * Base class representing an employee in the restaurant system.
 */
public class Employee {
    private int id;
    private String name;
    private String role;

    public Employee(int intId, String strName, String strRole) {
        this.id = intId;
        this.name = strName;
        this.role = strRole;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    // Example behaviors
    public void login() {
        System.out.println(name + " logged in.");
    }

    public void logout() {
        System.out.println(name + " logged out.");
    }
}
