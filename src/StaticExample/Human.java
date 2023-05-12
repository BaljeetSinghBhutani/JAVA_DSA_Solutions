package StaticExample;

public class Human {
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;

    }

    int age;
    String name;
    int salary;
    boolean married;
   public  static long population;

   static void message(){
       System.out.println("Hello World!!");
//       System.out.println(this.age); - this we cannot do it
   }

}
