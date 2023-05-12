package abstarctDemo;

public class daughter  extends Parent{
    public daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a coder");
    }

    @Override
    void Partner() {
        System.out.println("I love Pepper Potts");
    }


}
