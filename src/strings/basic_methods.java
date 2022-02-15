package strings;

import java.lang.*;

public class basic_methods {
    public static void main(String[] args) {
        char[] x = new char[] {'s', 'u', 'b', 'u'};

        String y = new String(x);
        System.out.println(y);

        System.out.println(y.charAt(2));
        System.out.println(y.compareTo("subu1"));
        System.out.println(y.replace('u', 'h'));
    }
}
