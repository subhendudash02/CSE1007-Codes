package switchCase;

import java.util.Scanner;

public class enhanced_switch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String transport = obj.next();

        // new -syntax
        switch (transport) {
            case "train" -> System.out.println("Long");
            case "car" -> System.out.println("Cozy");
            case "bike" -> System.out.println("Wow");
            default -> System.out.println("Noob");
        }
    }
}
