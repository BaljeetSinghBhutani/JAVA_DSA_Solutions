package Properties.polymorphism;

public class main {
    public static void main(String[] args) {
        Shapes shape  =new Shapes();
        Circle circle = new Circle();
        Square square  = new Square();

        Shapes square1 = new Square();
        square1.area();
    }
}
