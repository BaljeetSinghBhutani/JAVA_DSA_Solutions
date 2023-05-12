package Interfaces.NestedInterface;

public class A {
//    Nested Interface
interface NestedInterface{
    boolean isODD(int num);

}
}

class B implements A.NestedInterface{

    @Override
    public boolean isODD(int num) {
//        return num%2!=0;
//        0r
        return (num & 1)==1;
    }

    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isODD(6));
    }
}
