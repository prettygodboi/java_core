package vtb_lessons.lesson2;

public class Wall implements Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void contest(Participant participant) {
        if (participant.jump(height)) {
            System.out.println(participant + " ������� ����������� ����� ������� " + height);
        } else {
            System.out.println(participant + " �� ��������� � �������");
        }
    }
}
