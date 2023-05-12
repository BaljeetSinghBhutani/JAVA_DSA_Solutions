package Properties.Inheritance;

public class Boxweight extends Box {
    double weight;

    public Boxweight() {
        this.weight = -1;
    }
 Boxweight(Boxweight other)
 {
     super(other);
     weight = other.weight;
 }

    public Boxweight(double height, double length, double width, double weight) {

        super(height, length, width);
//        used to initialise values present in parent class
        this.weight = weight;
    }

    Boxweight(double side, double weight)
    {
        super(side);
this.weight  = weight;

    }


}
