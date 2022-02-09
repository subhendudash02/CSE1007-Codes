package Lab_1;

import java.util.Scanner;

public class question_2 {
    // palindrome
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = obj.nextInt();
        int n2 = n;

        int reverse = 0;

        while (n != 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n /= 10;
        }

        if (n2 == reverse) {
            System.out.println(n2 + " is palindrome.");
        }
        else {
            System.out.println(n2 + " is not palindrome.");
        }
    }
}
