package Lab_1;

import java.util.Scanner;

public class question_5 {
    // prime or not
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = obj.nextInt();
        int c = 0;

        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                c = 1;
                break;
            }
        }

        if (n == 0 || n == 1) {
            System.out.println(n + " is neither prime nor composite.");
        }
        else {
            if (c == 0) {
                System.out.println(n + " is a prime number.");
            }
            else {
                System.out.println(n + " is a composite number.");
            }
        }
    }
}
