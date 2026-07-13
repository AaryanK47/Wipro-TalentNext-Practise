package Classes_n_Objects;

/*
Hands-on Assignment:

Create a class Box that uses a parameterized constructor to initialize the
dimensions of a box. The dimensions of the Box are width, height, and depth.
The class should have a method that can return the volume of the box.
Create an object of the Box class and test the functionalities.
*/

class Box {

    int width;
    int height;
    int depth;

    // Parameterized constructor
    Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    int getVolume() {
        return width * height * depth;
    }
}

public class TestBox {

    public static void main(String[] args) {

        Box box = new Box(5, 4, 3);

        System.out.println("Width  : " + box.width);
        System.out.println("Height : " + box.height);
        System.out.println("Depth  : " + box.depth);
        System.out.println("Volume : " + box.getVolume());
    }
}