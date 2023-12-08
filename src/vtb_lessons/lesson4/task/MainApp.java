package vtb_lessons.lesson4.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(arrToArrayList(arr));
        swapElem(arr,0,8);
        System.out.println(Arrays.toString(arr));

        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Apple apple = new Apple();
        Apple apple1 = new Apple();
        Orange orange = new Orange();

        appleBox.addFruit(apple);
        appleBox2.addFruit(apple1);
        appleBox2.addFruit(apple1);
        orangeBox.addFruit(orange);
        appleBox.fill(appleBox2);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());
    }

    public static void swapElem(Integer[] arr,int index, int anotherIndex) {
        int temp =arr[index];
        arr[index] = arr[anotherIndex];
        arr[anotherIndex] = temp;
    }

    public static List<Integer> arrToArrayList(Integer[] arr){
        return new ArrayList<>(List.of(arr));
    }
}
