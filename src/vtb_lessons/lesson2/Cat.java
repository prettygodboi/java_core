package vtb_lessons.lesson2;

public class Cat implements Participant{
    int maxRunDistance;
    int maxJumpHeight;

    public Cat(int maxRunDistance, int maxJumpHeight) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public boolean run(int distance) {
        return distance<=maxRunDistance;
    }

    @Override
    public boolean jump(int height) {
        return height<=maxJumpHeight;
    }

    @Override
    public String toString() {
        return "Кот";
    }
}
