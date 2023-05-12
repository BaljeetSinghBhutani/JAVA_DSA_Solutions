package Access;

public class Object_Demo {
    int num;

    public Object_Demo(int num) {
        this.num = num;
    }

    public Object_Demo() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    public static void main(String[] args) {
        Object_Demo obj = new Object_Demo(34);
        Object_Demo obj2 = new Object_Demo(34);
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
    }
}
