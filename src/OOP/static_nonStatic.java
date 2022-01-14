package OOP;

public class static_nonStatic {
    public static void main(String[] args) {
        // greet(); // Wrong

        // Non-static can't be used inside static, so either make an object and access the non-static function
        // or make the function static

        static_nonStatic k = new static_nonStatic();
        k.greet();

        greet2();

        static_nonStatic n = new static_nonStatic();
        n.newfunc();

        /*
        *
        *
        *
        * */

        newClass a = new newClass(24);
        newClass b = new newClass(30);
        System.out.println(newClass.count); // static doesn't depend on the object
        System.out.println(a.age);
    }

    void greet() {
        System.out.println("Hi");
    }

    static void greet2() {
        System.out.println("Hello");
    }

    void newfunc() {
        greet();
    }
}

class newClass {
    int age;
    static int count;

    newClass(int age) {
        this.age = age;
        newClass.count++; // imp
    }
}