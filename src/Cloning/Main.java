package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal  = new Human(22, "Kunal");
//        Human twin = new Human(kunal);

        Human twin = (Human) kunal.clone();
        System.out.println(twin.age + "  " + twin.name + Arrays.toString(twin.arr));
        twin.arr[0] =  8;
//        A shallow copy has been made here for non - primitives the changes will reflect everywhere
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(kunal.arr));



    }
}
