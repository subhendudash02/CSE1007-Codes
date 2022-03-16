package IO;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("file.txt");
            int i = 0;
            while ((i = f.read()) != -1) {
                System.out.println((char)i);
            }
            f.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
