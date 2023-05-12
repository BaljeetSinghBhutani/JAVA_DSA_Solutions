package Cloning;

public class Human implements Cloneable {
    int age;
    String name;
     int arr[];
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        arr  = new int[] {1, 2, 3, 4, 5};
    }

    public Human(Human other)
    {
        this.age = other.age;
        this.name  = other.name;

    }
    public Object clone() throws CloneNotSupportedException {
//        this is a deep copy
      Human twin  = (Human)super.clone(); //- This will create a shallow copy
      twin.arr = new int[twin.arr.length];
        System.arraycopy(this.arr, 0, twin.arr, 0, twin.arr.length);
      return twin;
    }

}
