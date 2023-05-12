package BitWise;

import java.util.Scanner;

public class Odd_and_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if((n&1)==1){
            System.out.println("Number is Odd!!");
        }
        else {
            System.out.println("Number is Even!!");
        }
    }
}
