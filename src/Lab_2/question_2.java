package Lab_2;

import java.util.Scanner;

public class question_2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int terms = obj.nextInt();

        int[] arr = new int[terms];

        for (int i = 0; i < terms; i++) {
            arr[i] = obj.nextInt();
        }

        int j, temp;

        for(int i = 1; i < terms; i++) {
            j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        System.out.println("Maximum difference: " + arr[0] + " " + arr[terms - 1]);

        int min = 1000;
        int a = 0, b = 0;

        for (int i = 0; i < terms - 1; i++) {
            int i1 = arr[i + 1] - arr[i];
            if (i1 < min) {
                min = i1;
                a = arr[i];
                b = arr[i + 1];
            }
        }

        System.out.println("Minimum difference: " + a + " " + b);
    }
}
