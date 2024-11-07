import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();

        int[] dataPoints = new int[100];
        int userInput = SafeInput.getRangedInt(in, "Please choose a number", 1, 100);
        int searchTarget = 0;
        searchTarget = in.nextInt();
        in.nextLine(); //clear input buffer
        boolean foundTarget = false;
        boolean foundInput = false;

        int count = 0;
        for (int e = 0; e < dataPoints.length; e++) {
            if (dataPoints[e] == userInput) {
                count++;
                System.out.println("Your value was found " + count + " times in the array");
            }


        }
    }
}