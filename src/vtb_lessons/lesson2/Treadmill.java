package vtb_lessons.lesson2;

public class Treadmill implements Obstacle {

    int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void contest(Participant participant) {
        if (participant.run(distance)) {
            System.out.println(participant + " ������� �������� ��������� - " + distance);
        } else {
            System.out.println(participant + " �� ��������� � �������");
        }
    }
}
