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

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
