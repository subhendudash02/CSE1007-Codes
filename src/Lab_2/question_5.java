package Lab_2;

import java.util.Scanner;

public class question_5 {
    static void subArr(String[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int terms = obj.nextInt();

        String[] arr = new String[terms];

        for (int i = 0; i < terms; i++) {
            arr[i] = obj.nextLine();
        }

        System.out.print("Enter starting index: ");
        int a = obj.nextInt();
        System.out.print("Enter ending index: ");
        int b = obj.nextInt();

        subArr(arr, a, b);
    }
}
