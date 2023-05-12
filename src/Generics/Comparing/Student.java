package Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student>{
    int Roll_No;
    float marks;

    public Student(int roll_No, float marks) {
        Roll_No = roll_No;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
return (int) (this.marks- o.marks);
    }

    @Override
    public String toString() {
//        System.out.println("In compare to Method!!");
        return marks + " - " + Roll_No;
    }

    public static void main(String[] args) {
//        Student Baljeet = new Student(14, 8.5f);
//        Student Muskan = new Student(75, 6.0f);
//  if(Baljeet.compareTo(Muskan)>0){
//    System.out.println("Baljeet Will Fuck Muskan");
//}
Student Kunal =new Student(12,89.76f );
Student Rahul =new Student(5,99.52f );
Student Arpit  = new Student(12,77.76f );
Student Karan = new Student(13,90.32f );
Student Sachin = new Student(9,75.76f );

Student[] list = {Kunal, Rahul, Arpit, Karan, Sachin};
        System.out.println(Arrays.toString(list));

Arrays.sort(list, (o1, o2) -> (int) ((int)o1.Roll_No - o2.Roll_No));
        System.out.println(Arrays.toString(list));
    }


}
