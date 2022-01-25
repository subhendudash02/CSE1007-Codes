package OOP.inheritance;

public class inherit_box extends Box {
    double volume;

    inherit_box(double l, double b, double h) {
        super(l, b, h); // initialise values present in Box
        volume = l * b * h;
    }

    public static void main(String[] args) {
        inherit_box x = new inherit_box(4, 5, 6);
        System.out.println("Volume = " + x.volume);

        Box y = new Box();
        y.print();
    }
}
