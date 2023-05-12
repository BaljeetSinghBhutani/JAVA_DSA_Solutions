package Interfaces.ExtendDemo2;

public interface A {
//    Static Interface method should always have a body!!
static  void greeting(){
    System.out.println("I am a static Method in A Interface!!");
//    call this method via the Interface name!!
}

   default void fun(){
       System.out.println(" I am in A!!");
   }
}
