package Exceptions;

import java.util.Scanner;

class Yo extends Exception {
    public Yo(String s) {
        System.out.println(s);
    }
}

public class MyException {
    public static void main(String[] args) {
        int age;
        Scanner obj = new Scanner(System.in);
        age = obj.nextInt();

        try {
            if (age < 18) {
                throw new Yo("You can't vote.");
            }
            else {
                System.out.println("eligible");
            }
        }
        catch(Yo e) {
            System.out.println(e);
        }
    }
}
