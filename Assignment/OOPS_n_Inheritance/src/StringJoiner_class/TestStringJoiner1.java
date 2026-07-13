package StringJoiner_class;

/*
Hands-on Assignment:

Given an ArrayList containing n names, use StringJoiner to
construct a new sequence of names separated by ',' (comma)
and enclosed in { } brackets.
*/

import java.util.ArrayList;
import java.util.StringJoiner;

public class TestStringJoiner1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Rohit");
        names.add("Virat");
        names.add("Sachin");

        StringJoiner sj = new StringJoiner(",", "{", "}");

        for (String name : names) {
            sj.add(name);
        }

        System.out.println(sj);
    }
}
