package Packages.b;

import Access.A;

public class main extends A {

    public main(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
    main obj = new main(3, "Ayan");
    int a  = obj.num;

    }
}
