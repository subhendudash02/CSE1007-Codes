package FileHandling;

import java.io.FileOutputStream;
import java.lang.*;

public class writing_into_file {
    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("1.txt");
            f.write("Hehe Java".getBytes());
            f.close();
            System.out.println("Success");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
