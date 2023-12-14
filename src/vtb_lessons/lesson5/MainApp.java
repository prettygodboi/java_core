package vtb_lessons.lesson5;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "a", "c", "d", "a", "b", "e", "f", "g"};
        Map<String, Integer> hm = new HashMap<>();
        for (String string : strings) {
            hm.put(string, hm.getOrDefault(string, 0) + 1);
        }
        System.out.println(hm.entrySet().stream().max(Map.Entry.comparingByValue()).get());
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Dima", "666");
        phoneBook.add("Vasya", "665");
        phoneBook.get("Dima");
        phoneBook.get("Vasya");
    }
}
