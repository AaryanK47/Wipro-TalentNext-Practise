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

public class Employee extends Person {

    private double annualSalary;
    private int yearStarted;
    private String insuranceNumber;

    public Employee(String name, double annualSalary, int yearStarted, String insuranceNumber) {

        super(name);
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.insuranceNumber = insuranceNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
}
