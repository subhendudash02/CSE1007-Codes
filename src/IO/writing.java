package IO;

import java.io.FileWriter;
import java.io.IOException;

public class writing {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("file.txt");
        f.write("Welcome to Java Programming");
        f.close();

    }
}
