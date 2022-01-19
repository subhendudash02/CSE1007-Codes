package Jan_19;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        String sentence = "VIT was established with the aim of providing quality higher education on par with international standards. It persistently seeks and adopts innovative methods to improve the quality of higher education on a consistent basis. The campus has a cosmopolitan atmosphere with students from all corners of the globe. Experienced and learned teachers are strongly encouraged to nurture the students.";

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the substring you want to search: ");
        String subs = s.nextLine();

        String[] c = sentence.split(" ");

        int count = countOccurrence(c, subs);

        if (count == 0) {
            System.out.println("Count: " + count + "\nLocation: -1");
        }
        else {
            System.out.println("Count: " + count);
            System.out.print("Location: ");
            int[] indices = returnInd(sentence, subs, count);

            for (int i = 0; i < indices.length; i++) {
                System.out.print(indices[i] + " ");
            }
        }

    }

    static int countOccurrence(String[] arr, String subs) {
        int count = 0;
        for (String s : arr) {
            if (s.equals(subs)) {
                count++;
            }
        }
        return count;
    }

    static int[] returnInd(String s, String subs, int count) {
        int[] li = new int[count];
        int ind = 0;

        for (int i = 0; i < count; i++) {
            li[i] = s.indexOf(subs, ind + subs.length());
            ind = li[i];
        }
        return li;
    }
}
