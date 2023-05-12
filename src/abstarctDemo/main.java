package abstarctDemo;

public class main {
    public static void main(String[] args) {
son son = new son(22);
son.career();
son.normal();
Parent daughter = new daughter(26);
daughter.career();
Parent.hello();
//Parent parent  = new Parent(22); -
//        You cannot create a constructor of an abstract class
    }
}
