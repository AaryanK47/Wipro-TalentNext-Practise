package Optional_class;

/*
Hands-on Assignment:

Given an Employee object which may be initialized to null,
use Optional class to check if it is null and to throw a
user defined exception InvalidEmployeeException.
*/

import java.util.Optional;

public class TestOptional3 {

    public static void main(String[] args) {

        Employee emp = null;

        try {

            Employee e = Optional.ofNullable(emp)
                    .orElseThrow(() ->
                            new InvalidEmployeeException("Employee object is null"));

            e.display();

        } catch (InvalidEmployeeException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
