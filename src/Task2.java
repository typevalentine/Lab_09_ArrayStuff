import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random gen = new Random();

        int[] dataPoints = new int[100];
        for (int i = 0; i < dataPoints.length; i++) {
            int val = gen.nextInt(100) + 1;
            dataPoints[i] = val;
        }
        for (int i = 0; i < dataPoints.length; i++) {
            if (i != dataPoints.length - 1) {
                System.out.print(dataPoints[i] + " | ");
            } else
            {
                System.out.print(dataPoints[i] + "\n");
            }
        }
    }
}
