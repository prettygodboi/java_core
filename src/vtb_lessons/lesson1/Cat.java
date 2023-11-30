package vtb_lessons.lesson1;

public class Cat extends Animal{
    public static int count;
    public Cat(String type, int maxSwimDistance, int maxRunDistance) {
        super(type, 0, maxRunDistance);
        count++;
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
