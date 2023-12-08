package vtb_lessons.lesson5;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    HashMap<String, Set<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber){
        if (!phoneBook.containsKey(surname)){
            phoneBook.put(surname, new HashSet<>());
            phoneBook.get(surname).add(phoneNumber);
        }
    }

    public void get(String surname) {
        if (phoneBook.containsKey(surname)) {
            System.out.println(phoneBook.get(surname));
        }
    }
}
