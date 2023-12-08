package vtb_lessons.lesson4.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    List<T> container;
    float boxWeight;

    public Box() {
        this.container = new ArrayList<>();
    }

    public Box(T... fruits) {
        this.container = new ArrayList<>(Arrays.asList(fruits));
    }

    public void addFruit(T fruit){
        this.container.add(fruit);
    }

    public float getWeight(){
        boxWeight = 0.0f;
        for (T fruit : container) {
            boxWeight += fruit.getWeight();
        }
        return boxWeight;
    }

    public boolean compare(T anotherBox){
        return this.boxWeight == anotherBox.getWeight();
    }

    public void fill(Box<T> anotherBox){
        if (!this.container.isEmpty()){
            anotherBox.container.addAll(this.container);
            container.clear();
        }
    }
}
