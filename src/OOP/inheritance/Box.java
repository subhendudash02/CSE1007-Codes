package OOP.inheritance;

public class Box {
    double length;
    double breadth;
    double height;

    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    Box() {
        this(1, 1, 1);
    }

    void print() {
        System.out.println(this.length + " " + this.breadth + " " + this.height);
    }
}
