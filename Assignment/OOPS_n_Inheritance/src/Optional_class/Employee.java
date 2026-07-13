package Optional_class;

/*
Hands-on Assignment:

Given an Employee object which may be initialized to null,
use Optional class to check if it is null and to throw a
user defined exception InvalidEmployeeException.
*/

public class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
    }
}