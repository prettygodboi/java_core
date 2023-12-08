package vtb_lessons.lesson4;

public class Stats<T extends Number> {
    private T[] nums;

    public Stats(T... nums) {
        this.nums = nums;
    }

    public double avg(){
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }
}
class Avg {
    public static void main(String[] args) {
        Stats<Integer> integerStats = new Stats<>(1, 2, 3, 4);
        System.out.println(integerStats.avg());
    }
}
