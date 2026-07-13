package Inheritance;

/*
Hands-on Assignment:

Create a class Person with a member variable name and a method getName().
Create a class Employee that extends Person.

Employee class should have the following member variables:
- annualSalary
- yearStarted
- insuranceNumber

Create suitable constructors and getter/setter methods.

Test the classes by creating an object of Employee and display all the
details using the getter methods.
*/

public class TestEmployee {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Rahul",
                750000,
                2023,
                "INS1001"
        );

        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("Name             : " + emp.getName());
        System.out.println("Annual Salary    : " + emp.getAnnualSalary());
        System.out.println("Year Started     : " + emp.getYearStarted());
        System.out.println("Insurance Number : " + emp.getInsuranceNumber());
    }
}
