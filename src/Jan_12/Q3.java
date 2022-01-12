package Jan_12;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();

        int[] arr = new int[p];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int[] res = oddEven(arr);

        System.out.println("Odd: " + res[0] + "\n" + "Even: " + res[1]);

    }

    static int[] oddEven(int[] arr) {
        int[] oe = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                oe[1]++;
            }
            else {
                oe[0]++;
            }
        }
        return oe;
    }
}
