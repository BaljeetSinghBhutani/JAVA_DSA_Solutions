package SandeepJaim.Class_and_objects;
class Point{
    int x, y;

    Point(int x, int y)
    {
        this.x = x;
        this.y  =y;
    }

    Point setX(int x)
    {
     this.x =  x;
    return this;
    }
      Point setY(int x)
    {
        this.y =  y;
        return this;
    }

}
public class this_reference {
    public static void main(String[] args) {
Point p1  = new Point(10, 20);
Point p2  = new Point(5, 15);
        System.out.println(p1.setX(2).setY(4));

    }
}
