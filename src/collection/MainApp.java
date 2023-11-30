package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
//        collection.MyLinkedList myLinkedList = new collection.MyLinkedList();
//        myLinkedList.add(1);
//        myLinkedList.add(2);
//        myLinkedList.add(3);
//
//        System.out.println(myLinkedList);
//        System.out.println(myLinkedList.get(1));
//        System.out.println(myLinkedList.get(0));
//        System.out.println(myLinkedList.get(2));
//        myLinkedList.remove(1);
//        System.out.println(myLinkedList);
//
//        collection.MyArrayList<Integer> myArrayList = new collection.MyArrayList<>();
//        myArrayList.add(2);
//        System.out.println(myArrayList);
//
//        int[] array = new int[]{1,5,3,15,2};
//        System.out.println(Arrays.stream(array).sorted().collect(Collectors.toList());

        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 != 0 && sum(i)){
                System.out.println(i);
            }

        }

//        for(int i = 0; i < 100; i++){
//            if (i == 0){
//                continue;
//            }
//            if (i % 3 == 0 & i % 5 == 0) {
//                System.out.println("FizzBuzz" + i);
//            }
//            if (i % 3 == 0){
//                System.out.println("Fizz" + i);
//            }
//            if (i % 5 == 0) {
//                System.out.println("Buzz" + i);
//            }else {
//                System.out.println(i);
//            }
//        }
    }

    public static boolean sum(int num){
        int sum = 0;
        while (num > 0 & sum < 10){
            sum += num % 10;
            num = num/10;
        }
        return sum < 10;
    }
}
