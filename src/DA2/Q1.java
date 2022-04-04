package DA2;

import java.util.InputMismatchException;
import java.util.Scanner;

class UserException extends Exception {
    public UserException(String s) {
        System.out.println(s);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter pin: ");
        int pin = s.nextInt();
        try {
            if (pin != 1234) {
                throw new UserException("Invalid Pin Number");
            }
        }
        catch (UserException e) {
            System.out.println(e);
        }

        s.nextLine();

        int balance = 10000;
        System.out.print("Withdraw / Deposit (W/D): ");
        String ans = s.nextLine();

        try {
            if (!ans.equals("W") || !ans.equals("D")) {
                throw new UserException("Invalid Choice");
            }
        }
        catch (InputMismatchException e) {
            System.out.println(e);
        } catch (UserException e) {
            System.out.println(e);
        }

        if (ans.equals("D")) {
            System.out.print("Enter the amount: ");
            int amount = s.nextInt();
            balance += amount;
            System.out.println("Amount: " + amount);
            System.out.println("Balance: " + balance);
        }
        else if (ans.equals("W")) {
            System.out.print("Enter the amount: ");
            int amount = s.nextInt();
            try {
                if (amount < 100 || amount > 20000) {
                    throw new UserException("Invalid amount");
                }
                else if (amount % 100 != 0) {
                    throw new UserException("Invalid amount");
                }
                else if (amount > balance) {
                    throw new UserException("Insufficient balance");
                }
            }
            catch (UserException e) {
                System.out.println(e);
            }

            balance -= amount;
            System.out.println("Amount: " + amount);
            System.out.println("Balance: " + balance);
        }
    }
}
