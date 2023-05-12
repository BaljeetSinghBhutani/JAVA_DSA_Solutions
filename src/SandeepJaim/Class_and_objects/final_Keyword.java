package SandeepJaim.Class_and_objects;

public class final_Keyword {
    static final int max;
    static {
        max  = 100;
    }
    public static void main(String[] args) {
    final StringBuffer sb  = new StringBuffer("Geeks");
    sb.append("forGeeks");
        System.out.println(sb);


    }
}
