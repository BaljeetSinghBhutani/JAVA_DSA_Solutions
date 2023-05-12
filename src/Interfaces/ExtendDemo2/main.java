package Interfaces.ExtendDemo2;

public class main implements B, A {


//    public void fun() {
//
//    }

    @Override
     public void greet() {

    }
        public void fun(){
        System.out.println(" I am in main class!!");
    }

    public static void main(String[] args) {
        A a = new main();
        a.fun();
        A.greeting();
    }
}
