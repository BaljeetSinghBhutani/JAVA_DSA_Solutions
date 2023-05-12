package StaticExample;

import com.sun.tools.javac.Main;

public class main {
    public static void main(String[] args) {
        Human kunal   = new Human(22,"Kunal Kushwaha", 100000, false);
        Human rahul   = new Human(22,"Rahul Kushwaha", 100000, false);
        System.out.println(kunal.population);
        System.out.println(rahul.population);
        main obj  =  new main();
        obj.fun2();
    }
//    this is not dependent upon objects
    static void func(){
//        greeting();
//        you cannot use it because it requires an instance but the function you are using it in does not depend on instances.

//        you cannot access non - static without referencing their instances in a static context

//        hence , now i am referencing to it;
//   main obj  = new main();
//   obj.greeting();

    }
//this is dependent upon objects
    void fun2(){
        System.out.println("Fun2 is calling!!");
        greeting();
    }
    void greeting(){
func();
    }
}
