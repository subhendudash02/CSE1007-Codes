package strings;

public class string_buffer {
    public static void main(String[] args) {
        StringBuffer p = new StringBuffer("Hello");
        System.out.println(p.append(" Java"));
        System.out.println(p.insert(4, "yoyo"));
        System.out.println(p.delete(4, 8));
        System.out.println(p.indexOf("l"));
    }
}
