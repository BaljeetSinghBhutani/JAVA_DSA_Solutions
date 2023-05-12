package SandeepJaim.Lecture_1_Practice_Question;

public class Bitwise_Operator {
    static void bitWiseOp(int a, int b, int c) {
int d = a ^ a;
int e =  c ^ b;
int f =  a & b;
int g = a | (a ^ a);
int h =  ~e;

        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);


    }
    public static void main(String[] args) {

    }
}
