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
        // System.out.println(x.length); // Error because private var/method can't be accessed in different files

        Box y = new Box();
        y.print();

        /*
         *
         *
         * */

        Box newVar = new inherit_box(2, 2, 2);
        System.out.println(newVar.height);
//        System.out.println(newVar.volume); // Error

//        inherit_box box8 = new Box(); // Error
    }
}
