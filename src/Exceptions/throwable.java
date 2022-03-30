package Exceptions;

import java.util.Scanner;

public class throwable {
    public static void main(String[] args) {
        int age;
        Scanner obj = new Scanner(System.in);
        age = obj.nextInt();

        Throwable t = new Throwable("You can't vote");

        try {
            if (age < 18) {
                throw t;
            } else {
                System.out.println("eligible");
            }
        } catch (Throwable e) {
            System.out.println(e);
        }
    }
}
