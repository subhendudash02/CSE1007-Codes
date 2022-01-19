package com.Subhendu;

import java.util.Scanner;

// to test out many features in Java

public class first {
    public static void main(String[] args) {
        // lol first program
        System.out.println("First Program");
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int a = 5;
        double b = 6.0;
        System.out.println(a + b);

        // Taking Inputs
        Scanner object = new Scanner(System.in);
        String name = object.nextLine();
        System.out.println("Name: " + name);

        // if-else
        if (name.equals("Subhendu")) {
            System.out.println("Hi");
        }
        else {
            System.out.println("Someone else");
        }

        char c[] = {'V', 'I', 'T'};
        String s = new String(c);

        System.out.println(s);

        System.out.println(System.identityHashCode(s));
        s = "Hello";
        System.out.println(System.identityHashCode(s));
        s = "Yo";
        System.out.println(System.identityHashCode(s));
    }
}
