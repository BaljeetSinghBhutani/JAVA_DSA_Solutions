package SandeepJaim.Class_and_objects;

public class Test {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        c1.print();
        Complex c2 = new Complex(6, 7);
        c2.print();
        c1.add(c2);
        c1.print();

    }
}
