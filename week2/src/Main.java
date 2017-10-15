import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[1000];
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            array[i] = i * 10 + random.nextInt(10);
        }
        long endTime = System.nanoTime();
        System.out.println("执行时间为：" + (endTime - startTime) + "ns");
        System.out.println(Arrays.toString(array));
    }
}
