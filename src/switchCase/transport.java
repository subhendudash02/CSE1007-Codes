package switchCase;

import java.util.Scanner;

public class transport {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String transport = obj.next();

        // old -syntax
        switch (transport) {
            case "train":
                System.out.println("Long");
                break;
            case "car":
                System.out.println("Cozy");
                break;
            case "bike":
                System.out.println("Wow");
                break;
            default:
                System.out.println("Noob");
        }
    }
}
