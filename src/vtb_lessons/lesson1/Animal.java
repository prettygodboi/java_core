package vtb_lessons.lesson1;

public abstract class Animal {
    String type;
    int maxSwimDistance;
    int maxRunDistance;
    public static int count;

    public Animal(String type, int maxSwimDistance, int maxRunDistance) {
        this.type = type;
        this.maxSwimDistance = maxSwimDistance;
        this.maxRunDistance =maxRunDistance;
        count++;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(type + " �������� " + distance + " ������");
        }
        else {
            System.out.println(type + " �� ��������� � �������");
        }
    }

    public void swim(int distance){
        System.out.println(type + " ������� " + distance + " ������");
    }
}
