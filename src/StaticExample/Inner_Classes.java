package StaticExample;

import java.util.Arrays;

public class Inner_Classes {

    static class Test{
     static  String name;

        public Test(String name) {
           this.name = name;
        }

        @Override
        public String toString() {
      return name;
        }
    }


    public static void main(String[] args) {
Test a  = new Test("Kunal");
Test  b = new Test("Rahul");
        System.out.println(a.name);
        System.out.println(b.name);
        Arrays.toString( new int[]{1, 2, 3});
        System.out.println(a);

    }
}
