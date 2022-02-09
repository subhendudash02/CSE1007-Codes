package Lab_2;

import java.util.ArrayList;
import java.util.Scanner;

public class question_3 {
    static void print(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner obj = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>(5);
        ArrayList<Integer> arr2 = new ArrayList<>(5);

        System.out.print("Enter 10 elements: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = obj.nextInt();
            if (i > 4) {
                arr2.add(arr[i]);
            }
            else {
                arr1.add(arr[i]);
            }
        }

        System.out.println("After splitting: ");

        print(arr1);
        System.out.println();
        print(arr2);
    }
}
