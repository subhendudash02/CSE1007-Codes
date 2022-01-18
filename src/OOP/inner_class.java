package OOP;

// outer class can't be static
public class inner_class {
    // inner class may or may not be static
    static class A {
        String A;
        A(String A) {
            this.A = A;
        }

        void print() {
            System.out.println(this.A);
        }
    }

    class B {
        String B;
        B(String B) {
            this.B = B;
        }
    }

    public static void main(String[] args) {
        A obj1 = new A("Yo");
        obj1.print();


        // B obj2 = new B("Yo");   // Error
    }
}
