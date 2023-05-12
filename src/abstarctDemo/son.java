package abstarctDemo;

public class son extends Parent {
    public son(int age) {
        super(age);
//        this.age  = age;
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void Partner() {
        System.out.println("I love IronMan");
    }
}
