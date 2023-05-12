package StaticExample;

public class StaticBlock {
    static int a  = 4;
    static int b;
//will only run once when the first obj is being created i.e, when the class loads for the first time
    static {
        System.out.println("I am in static block!!");
        b  = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b +=3;
        System.out.println(StaticBlock.a +  " "+  StaticBlock.b);

        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " +  StaticBlock.b);
    }

}