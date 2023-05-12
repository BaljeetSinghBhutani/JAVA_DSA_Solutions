package EnumExamples;

import com.sun.security.jgss.GSSUtil;

public class Basic implements A{


    @Override
    public void hello() {

    }

    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
//        These are enum Constants
//        They are public, static, final
//        since it is final you cannot create child enums
//        type is week

        public void hello() {
            System.out.println("Me Hayo!!");
        }
        Week() {
            System.out.println("Constructor Calling "+ this);
        }
//        this is not public or protected, only private or default
//        why? we don't want to create new objects

//        Abstract is not allowed in Enum

    }


    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday")); //- This will return the Enum Constants
//        for (Week day: Week.values()) {
//            System.out.println(day);
//        }

//        System.out.println(Week.Thursday.ordinal());
    }
}
