package StaticExample;

public class main_Singleton_class {
    public static void main(String[] args) {
        Singletonclass obj1  = Singletonclass.getInstance();
        Singletonclass obj2  = Singletonclass.getInstance();
        Singletonclass obj3  = Singletonclass.getInstance();
//all three reference variable are pointing to just one object
    }
}
