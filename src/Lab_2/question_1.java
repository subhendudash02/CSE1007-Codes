package Lab_2;

import java.util.Scanner;

public class question_1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter 20 numbers: ");

        int[] arr = new int[4];

        for (int i = 0; i < 20; i++) {
            int n = obj.nextInt();
            if (n > 0) {
                arr[0] += 1;
            }
            else {
                arr[1] += 1;
            }

            if (n % 2 == 0) {
                arr[3] += 1;
            }
            else {
                arr[2] += 1;
            }
        }

        System.out.println("Positive: " + arr[0]);
        System.out.println("Negative: " + arr[1]);
        System.out.println("Odd: " + arr[2]);
        System.out.println("Even: " + arr[3]);

    }
}
