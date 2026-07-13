package Encapsulation_Abstraction;

/*
Hands-on Assignment:

Create a class Author with the following information.

Member variables:
- name (String)
- email (String)
- gender (char)

Parameterized Constructor:
- To initialize the variables.

Create a class Book with the following information.

Member variables:
- name (String)
- author (of the class Author you have just created)
- price (double)
- qtyInStock (int)

[Assumption: Each book will be written by exactly one Author]

Parameterized Constructor:
- To initialize the variables.

Getters and Setters for all the member variables.

In the main method, create a Book object and print all details of the book
(including the author details).
*/

public class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}