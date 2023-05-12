package Object_Oriented_Programing;

import java.util.Arrays;

public class Student {
    int roll;
    String name;
    float marks;
Student(int roll, String name, float marks)
{
    this.name  = name;
    this.roll = roll;
    this.marks  =  marks;
}
Student(){
    this(13, "Himanshi", 76.4f);

}

    public static void main(String[] args) {
    //      Student student[]  = new Student[5];
    //        System.out.println(Arrays.toString(student));
        Student baljeet = new Student(14, "Baljeet", 89);
        Student himanshi = new Student();
        System.out.println(baljeet.roll);
        System.out.println(himanshi.roll);

    }
}
