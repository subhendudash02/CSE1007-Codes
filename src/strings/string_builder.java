package strings;

public class string_builder {
    public static void main(String[] args) {
        StringBuilder p = new StringBuilder("Hello");
        System.out.println(p.append(" Java"));
        System.out.println(p.insert(4, "yoyo"));
        System.out.println(p.delete(4, 8));
        System.out.println(p.indexOf("l"));
    }
}
