package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class file_writer {
    public static void main(String[] args) throws IOException {
        String s = "To infinity and beyond!!!";
        FileWriter f = new FileWriter("2.txt");
        for (int i = 0; i < s.length(); i++) {
            f.write(s.charAt(i));
        }
        System.out.println("writing done");
        f.close();
    }
}
