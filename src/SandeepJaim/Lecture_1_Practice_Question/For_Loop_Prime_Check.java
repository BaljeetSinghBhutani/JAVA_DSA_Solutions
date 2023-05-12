package SandeepJaim.Lecture_1_Practice_Question;

public class For_Loop_Prime_Check {
    static void isPrime(int n) {
        if(n==1){
            System.out.print("No");
            System.out.println();
            return;
        }

        else if(n==2 || n==3 || n==5 || n==7){
            System.out.print("Yes");
            System.out.println();
            return;
        }
        else{
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i==0){
                    System.out.print("No");
                    System.out.println();
                    return;
                }

            }
            System.out.print("Yes");

        }

        System.out.println();
    }
    public static void main(String[] args) {
        isPrime(1);
        isPrime(1);
    }
}
