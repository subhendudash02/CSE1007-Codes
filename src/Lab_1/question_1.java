package Lab_1;

import java.util.Scanner;

public class question_1 {
    // fibonacci series
    static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        }
        else if (n == 2) {
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = obj.nextInt();

        System.out.print("\n");

        for (int i = 1; i <= terms + 1; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
