package FileHandling;

import java.io.FileInputStream;

public class reading_file {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("1.txt");
            while (f.read() != -1) {
                System.out.print((char)f.read());
            }
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
