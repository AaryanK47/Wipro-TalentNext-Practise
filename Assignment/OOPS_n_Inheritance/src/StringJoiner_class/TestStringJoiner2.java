package StringJoiner_class;

/*
Hands-on Assignment:

Given two StringJoiners s1 and s2 which contains n city names
separated by '-' (hyphen), display the output for the given cases:

i) s1 merged to s2.
ii) s2 merged to s1.
*/

import java.util.StringJoiner;

public class TestStringJoiner2 {

    public static void main(String[] args) {

        StringJoiner s1 = new StringJoiner("-");

        s1.add("Bangalore");
        s1.add("Mysore");
        s1.add("Hubli");

        StringJoiner s2 = new StringJoiner("-");

        s2.add("Delhi");
        s2.add("Mumbai");
        s2.add("Chennai");

        // s1 merged to s2
        StringJoiner merge1 = new StringJoiner("-");
        merge1.merge(s2);
        merge1.merge(s1);

        System.out.println("s1 merged to s2:");
        System.out.println(merge1);

        // s2 merged to s1
        StringJoiner merge2 = new StringJoiner("-");
        merge2.merge(s1);
        merge2.merge(s2);

        System.out.println("\ns2 merged to s1:");
        System.out.println(merge2);
    }
}
