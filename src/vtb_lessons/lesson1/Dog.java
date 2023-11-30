package vtb_lessons.lesson1;

public class Dog extends Animal{
    public Dog(String type, int maxSwimDistance, int maxRunDistance) {
        super(type, maxSwimDistance, maxRunDistance);
    }

    @Override
    public void run(int distance) {
        super.run(distance);
    }

    @Override
    public void swim(int distance) {
        super.swim(distance);
    }
}
