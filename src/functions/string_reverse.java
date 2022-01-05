package functions;

import java.lang.reflect.Array;

public class string_reverse {
    public static void main(String[] args) {
        String s = "Subhendu";
        char arr[] = s.toCharArray();
        strRev(0, arr.length - 1, arr);

        // array to string
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            b.append(arr[i]);
        }
        System.out.print(b);
    }

    static void strRev(int start, int end, char arr[]) {
        if (start > end) {
            return;
        }
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        strRev(start + 1, end - 1, arr);
    }
}
