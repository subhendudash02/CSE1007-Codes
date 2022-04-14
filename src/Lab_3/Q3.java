package Lab_3;

import java.util.Scanner;

class BankUser {
    String name, type;
    private int accno, bal;
    double rate = 0.08;
    float time;

    void getData() {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        name = s.next();
        System.out.print("Acc No: ");
        accno = s.nextInt();
        System.out.print("Type: ");
        type = s.next();
        System.out.print("Balance: ");
        bal = s.nextInt();
    }

    void deposit() {
        System.out.println("DEPOSIT");
        Scanner s = new Scanner(System.in);
        System.out.print("Time: ");
        time = s.nextFloat();
        if (type.equals("Savings")) {
            bal = (int) (bal + ((bal * rate * time)/100));
        }
        else {
            System.out.print("Amount: ");
            int amount = s.nextInt();
            bal += amount;
        }
    }

    void withdraw() {
        System.out.println("WITHDRAW");
        Scanner s = new Scanner(System.in);
        System.out.print("Amount: ");
        int amount = s.nextInt();
        if (amount > bal) {
            System.out.println("Can't withdraw! Penalty of 1000 rs");
            bal -= 1000;
        }
        else {
            bal -= amount;
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + bal);
    }
}

public class Q3 {
    public static void main(String[] args) {
        BankUser b = new BankUser();
        b.getData();
        b.deposit();
        b.withdraw();
        b.display();
    }
}
