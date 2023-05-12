package Properties.Inheritance;

public class BoxPrice  extends Boxweight {

    double cost;

    public BoxPrice(double height, double length, double width, double weight, double cost) {
        super(height, length, width, weight);
        this.cost = cost;
    }



    BoxPrice(){
        super();
    this.cost = -1;
    }
    BoxPrice(BoxPrice obj)
    {
        super(obj);
        this.cost  = obj.cost;
    }
    BoxPrice(double side, double weight, double cost)
    {
        super(side, weight);
        this.cost = cost;
    }
}
