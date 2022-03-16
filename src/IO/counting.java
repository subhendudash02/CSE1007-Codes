package IO;

// counting char, words, lines

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class counting {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        reader = new BufferedReader(new FileReader("file.txt"));

        String currentLine = reader.readLine();
        while (currentLine != null) {
            lineCount++;
            String[] words = currentLine.split(" ");
            wordCount = wordCount + words.length;

            for (String word:words) {
                charCount = charCount + word.length();
            }
            currentLine = reader.readLine();
        }

        System.out.println("Chars: " + charCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lineCount);
    }
}
