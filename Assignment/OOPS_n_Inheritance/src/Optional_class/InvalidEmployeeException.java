package Optional_class;

/*
Hands-on Assignment:

Given an Employee object which may be initialized to null,
use Optional class to check if it is null and to throw a
user defined exception InvalidEmployeeException.
*/

public class InvalidEmployeeException extends Exception {

    public InvalidEmployeeException(String message) {
        super(message);
    }
}
