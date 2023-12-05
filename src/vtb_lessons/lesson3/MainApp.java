package vtb_lessons.lesson3;

public class MainApp {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "a2", "3", "4"}
        };
        try {
            System.out.println(array(arr));
        } catch (MyException e){
            System.out.println("ignored");
        }
    }
    static int array(String[][] arr) {
        int sum = 0;
        if (!(arr.length == 4) | !(arr[0].length == 4)) {
            throw new MyArraySizeException();
        }

        for (String[] strings : arr) {
            for (String string : strings) {
                int n = Integer.parseInt(string);
                try {
                    sum += n;
                } catch (NumberFormatException e){
                    throw new MyArrayDataException();
                }
            }
        }
        return sum;
    }
}
