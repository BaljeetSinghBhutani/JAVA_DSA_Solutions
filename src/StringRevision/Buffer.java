package StringRevision;

public class Buffer {
    public static void main(String[] args) {
        StringBuffer  str = new StringBuffer("abc");
        str.setCharAt(0, 'd');
        System.out.println(str);
    }
}
