package OOP;

public class basics {
    public static void main(String[] args) {
        Student s = new Student();
        Student x = new Student(42, "Yo", 56);

        s.greet();
        s.disp();
        x.disp();
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
        this.roll = 14;
        this.name = "Subhendu Dash";
        this.marks = 99;
    }

    Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

}
