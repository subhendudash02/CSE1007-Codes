package Jan_12;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();

        int[] arr = new int[p];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        selectionSort(arr);
        System.out.print("Average expect min and max elements: " + avgNew(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }

                int temp = arr[mini];
                arr[mini] = arr[i];
                arr[i] = temp;
            }
        }
    }

    static int avgNew(int[] arr) {
        int s = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            s += arr[i];
        }

        return s / (arr.length - 2);
    }
}
