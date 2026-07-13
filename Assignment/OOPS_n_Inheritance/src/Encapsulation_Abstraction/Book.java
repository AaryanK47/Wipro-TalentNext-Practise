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

public class Book {

    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}