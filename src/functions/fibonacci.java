package functions;

import java.util.Scanner;

public class fibonacci {
    // recursion
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
    static int fib(int terms) {
        if (terms == 0 || terms == 1) {
            return terms;
        }
        return fib(terms - 1) + fib(terms - 2);
    }
}
