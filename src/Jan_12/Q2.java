package Jan_12;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();

        int[] arr = new int[p];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int[] copy = new int[p];
        copyArr(arr, copy);

        System.out.println("Elements of copied array: ");

        disp(copy);

    }

    static void copyArr(int[] arr, int[] copy) {
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
    }

    static void disp(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
