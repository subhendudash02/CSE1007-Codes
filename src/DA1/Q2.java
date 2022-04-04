package DA1;

import java.util.Scanner;

class UException extends Exception {
    public UException(String s) {
        System.out.println(s);
    }
}

class Customer extends Thread {
    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter product: ");
        String product = s.nextLine();

        double gst = 0.03;
        double wastage = 0;

        if (product.equals("Earrings")) {
            wastage = 0.05;
        }
        else if (product.equals("Bracelet")) {
            wastage = 0.1;
        }
        else if (product.equals("Necklace")) {
            wastage = 0.14;
        }

        System.out.print("Enter price: ");
        double price = s.nextDouble();
        System.out.println("Enter weight: ");
        double weight = s.nextDouble();

        try {
            if (price <= 0 && weight <= 0) {
                throw new UException("Invalid Input!");
            }
        }
        catch (UException e) {
            System.out.println(e);
        }

        double amount = weight * price;
        double w = amount * wastage;
        double finalGst = (amount + w) * gst;
        double net = amount + w + finalGst;

        System.out.println("Amount: " + amount);
        System.out.println("Wastage: " + w);
        System.out.println("GST: " + finalGst);
        System.out.println("Net Amount: " + net);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = new Customer();

        c1.start();
        c2.start();
        c3.start();
    }
}
