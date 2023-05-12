package SandeepJaim.Class_and_objects;

public class Complex {
    int real, img;
    void print(){
        System.out.println(real + " + " + img + "i");
    }
    Complex(int r, int i)
    {
        real =  r;
        img = i;
    }

    void add(Complex C)
    {
        real =  real + C.real;
        img  =  img  + C.img;
    }
}
