package comporation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        Cat cat = new Cat("Vasya", 2, "blue");
        Cat cat1 = new Cat("Musya", 10, "blue");
        Cat cat2 = new Cat("Bob", 5, "blue");
        cats.add(cat);
        cats.add(cat1);
        cats.add(cat2);
        Collections.sort(cats);
        System.out.println(cats);
    }
}
