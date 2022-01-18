package OOP;

public class staticBlock {
    static int a = 5;
    static int b;

    static {
        System.out.println("Executed only once");
        b = 10 * a;
    }

    public static void main(String[] args) {
        System.out.println(staticBlock.a + " " + staticBlock.b);
    }

}
