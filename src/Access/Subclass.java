package Access;

public class Subclass extends  A{
    int num;
    String name;

    public Subclass(int num, String name)
    {
        super(num, name);

    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(45, "Baljeet");
int  n = obj.num;
        System.out.println(obj instanceof  A);
        System.out.println(obj.getClass().getName());
    }
}
