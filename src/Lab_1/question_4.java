package Lab_1;

import java.util.Scanner;

public class question_4 {
    // Armstrong Number

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = obj.nextInt();
        int n2 = n;

        int arms = 0;

        while (n != 0) {
            int r = n % 10;
            arms += Math.pow(r, 3);
            n /= 10;
        }

        if (n2 == arms) {
            System.out.println(n2 + " is an Armstrong number.");
        }
        else {
            System.out.println(n2 + " is not an Armstrong number.");
        }
    }
}
