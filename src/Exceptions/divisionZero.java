package Exceptions;

import java.util.Scanner;

public class divisionZero {
    static int divideByZero(int a, int b) {
        int res = a / b;
        return res;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int res;
        try {
            if (b == 0) {
                throw new ArithmeticException("b should not be zero");
            }
            else {
                res = divideByZero(a, b);
            }

        }
        catch(ArithmeticException ex) {
            System.out.println(ex.getMessage());
//            throw ex;
        }
        finally {
            System.out.println("done");
        }
    }
}
