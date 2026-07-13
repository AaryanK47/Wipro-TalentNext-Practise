package Overriding_Polymorphism;

/*
Hands-on Assignment:

Create a base class Fruit with name, taste and size as its attributes.

Create a method called eat() which describes the name of the fruit
and its taste.

Inherit the same in 2 other classes Apple and Orange and override
the eat() method to represent each fruit taste.
*/

class Fruit {

    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

class Apple extends Fruit {

    Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

class Orange extends Fruit {

    Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

public class TestFruit {

    public static void main(String[] args) {

        Apple apple = new Apple();
        Orange orange = new Orange();

        apple.eat();
        orange.eat();
    }
}
