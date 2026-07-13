package Optional_class;

/*
Hands-on Assignment:

Use Optional class and avoid NullPointerException from the below code:

String names[] = new String[5];
System.out.print(names[0].length());
*/

import java.util.Optional;

public class TestOptional1 {

    public static void main(String[] args) {

        String[] names = new String[5];

        Optional<String> value = Optional.ofNullable(names[0]);

        if (value.isPresent())
            System.out.println(value.get().length());
        else
            System.out.println("Value is null");
    }
}
