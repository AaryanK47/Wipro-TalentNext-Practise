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

public class TestBook {

    public static void main(String[] args) {

        Author author = new Author("Rahul", "rahul@gmail.com", 'M');

        Book book = new Book("Java Programming", author, 599.0, 20);

        System.out.println("Book Details");
        System.out.println("------------");
        System.out.println("Book Name : " + book.getName());
        System.out.println("Price     : " + book.getPrice());
        System.out.println("Stock     : " + book.getQtyInStock());

        System.out.println("\nAuthor Details");
        System.out.println("--------------");
        System.out.println("Name   : " + book.getAuthor().getName());
        System.out.println("Email  : " + book.getAuthor().getEmail());
        System.out.println("Gender : " + book.getAuthor().getGender());
    }
}