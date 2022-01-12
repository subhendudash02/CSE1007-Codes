package Jan_12;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();

        int[] arr = new int[p];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Average: " + avg(arr));
    }

    static int avg(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s / arr.length;
    }
}
