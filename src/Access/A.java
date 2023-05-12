package Access;

public class A {
 protected  int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    String name;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr  = new int[num];
    }

    int arr[];

}
