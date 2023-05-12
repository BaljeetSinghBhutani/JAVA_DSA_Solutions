package SandeepJaim.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
//
        try {
            Scanner in = new Scanner(new File("test.in"));
            System.out.println("Exit main()");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found"+  e);
        }
        finally{
            System.out.println("Finally Block!!");
        }
    }
}
