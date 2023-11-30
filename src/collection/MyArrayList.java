package collection;

import java.io.ObjectStreamClass;
import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> {
    private static final int INIT_CAPACITY = 10;
    private Object[] array = new Object[INIT_CAPACITY];
    private int size = 0;
    transient Object[] elementData;

    public void add(T item){
        if (size == array.length - 1){
            resize(array.length * 2);
        }
        array[size++] = item;
    }

    public T get(int index){
        return (T) array[index];
    }

    public void remove(int index){
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];


        }
    }

    public void resize(int newSize){
        Object[] newArray = new Object[newSize];
        System.arraycopy(array,0,newArray,0, size);
        array = newArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
