package Properties.Inheritance;

public class Box {
double height;
double length;
double width;
double weight;

static  void greeting(){
    System.out.println("Hey I am in Box class Greetings!! ");
}
Box(){

    this.height = -1;
    this.length = -1;
    this.width  = -1;

}
//cube
    Box(double side)
    {
        this.width =  side;
        this.length  = side;
        this.height  = side;
    }

// for normal constructor

    public Box(double height, double length, double width) {
        System.out.println("Print parent class constructor!!");
        this.height = height;
        this.length = length;
        this.width = width;
    }
Box(Box old)
{
    this.height  = old.height;
    this.length  = old.length;
     this.width  = old.width;
}
public void information(){
    System.out.println("Running the box" + " height = " + height + " length = "+  length + "width = " + width);
}
    public static void main(String[] args) {
//Box box  = new Box(5);
//Box box1  = new Box(box);
//        System.out.println(box.height + "  " + box.length + "  " + box.width);
//Boxweight box3  = new Boxweight();
//Boxweight  box4 = new Boxweight(1, 2, 3, 4);
//Box box5  = new Boxweight(2, 3, 4, 8);
//Boxweight  box6  = (Boxweight) new Box();



BoxPrice box  = new BoxPrice(5, 8, 200);
Box.greeting();
Boxweight.greeting();
//you can run but you cannot override

    }
}
