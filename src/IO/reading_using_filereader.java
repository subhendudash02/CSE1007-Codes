package IO;

import java.io.FileReader;

public class reading_using_filereader {
    public static void main(String[] args) throws Exception {
        FileReader f = new FileReader("file.txt");
        int i;
        while ((i = f.read()) != -1) {
            System.out.print((char)i);
        }
    }
}
