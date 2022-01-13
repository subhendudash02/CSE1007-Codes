package OOP;

public class basics {
    public static void main(String[] args) {
        Student s = new Student();
        Student x = new Student(42, "Yo", 56);

        s.greet();
        s.disp();
        x.disp();

        Student y = new Student(s);
        y.disp();

        //final keyword
        final int a = 2;
        // a++; // wrong
        System.out.println(a);
    }
}

class Student {
    int roll;
    String name;
    int marks;

    void greet() {
        System.out.println("Hello, " + name);
    }

    void disp() {
        System.out.print(this.name + " " + this.roll + " " + this.marks);
        System.out.println();
    }

    Student() {
//        this.roll = 14;
//        this.name = "Subhendu Dash";
//        this.marks = 99;

        this (42, "Subhendu Dash", 99);
        // calling Student(roll, name, marks);
    }

    Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    // Operator overloading
    Student(Student other) {
        this.name = other.name;
        this.roll = other.roll;
        this.marks = other.marks;
    }

    // similar to destructor in C++

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");

        // will free the memory whenever Java wants
    }
}
