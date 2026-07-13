package Overriding_Polymorphism;

/*
Hands-on Assignment:

Write a program to create a class named Shape.
It should contain 2 methods, draw() and erase() that prints
"Drawing Shape" and "Erasing Shape" respectively.

Create three subclasses Circle, Triangle and Square.
Each class should override draw() and erase() methods.

draw() should print:
Drawing Circle
Drawing Triangle
Drawing Square

erase() should print:
Erasing Circle
Erasing Triangle
Erasing Square

Create objects as follows:

Shape c = new Circle();
Shape t = new Triangle();
Shape s = new Square();

Observe the polymorphic nature by calling draw() and erase().
*/

class Shape {

    void draw() {
        System.out.println("Drawing Shape");
    }

    void erase() {
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing Square");
    }
}

public class TestShape {

    public static void main(String[] args) {

        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        c.draw();
        c.erase();

        System.out.println();

        t.draw();
        t.erase();

        System.out.println();

        s.draw();
        s.erase();
    }
}
