package Exceptions;

public class array{
    static void arrayPrint() {
        int a[] = new int[] {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.print(a[i] + " ");
            }
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("lol out of range");
        }
    }

    public static void main(String[] args) {
        arrayPrint();
    }
}
