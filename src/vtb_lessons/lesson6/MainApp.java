package vtb_lessons.lesson6;

import java.util.Arrays;

public class MainApp {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    public static void main(String[] args) {
        arrInit();
        concurrentArrInit();
    }
    public static void arrInit(){
        float[]arr = new float[SIZE];
        long a = System.currentTimeMillis();
        Arrays.fill(arr, 1);
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Выполнение в одном потоке: " + (System.currentTimeMillis() - a));
    }

    public static void concurrentArrInit(){
        float[]arr = new float[SIZE];
        float[] leftArr = new float[HALF];
        float[] rightArr = new float[HALF];
        long a = System.currentTimeMillis();
        Arrays.fill(arr, 1);
        System.arraycopy(arr,0,leftArr,0,HALF);
        System.arraycopy(arr,HALF,rightArr,0,HALF);
        Thread thread = new Thread(() -> {
            for (int i = 0; i < leftArr.length; i++) {
                leftArr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        thread.start();
        Thread thread1 = new Thread(() -> {
            for (int i = 0, j = HALF; i < rightArr.length; i++) {
                rightArr[i] = (float) (arr[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
            }
        });
        thread1.start();

        try {
            thread1.join();
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.arraycopy(leftArr,0,arr,0,HALF);
        System.arraycopy(rightArr,0,arr,HALF,HALF);
        System.out.println("Выполнение в два потока: " + (System.currentTimeMillis() - a));
    }
}
