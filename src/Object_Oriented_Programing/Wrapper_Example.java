package Object_Oriented_Programing;

public class Wrapper_Example {
    public static void main(String[] args) {
//        int  a  = 10;
//Integer num = 45;
//        System.out.println(num.hashCode());
//final int bonus = 2;

A obj = null;
for(int i =0;i<10;i++)
{
    obj =  new A("Random name");
}
        System.out.println(obj);
    }
   static class A{
        final int INCREASE = 2;
//        always initialize while declaring it
        String name;

        public A(String name) {
            System.out.println("Object is being created");
            this.name = name;
        }
protected void finalize() throws Throwable{
    System.out.println("Object is destroyed");
        }

    }
}
