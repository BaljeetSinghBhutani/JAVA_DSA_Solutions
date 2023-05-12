package BitWise;

public class Pow_of_two {
    public static void main(String[] args) {
        int n = 0   ;
        int ans = n & (n-1);
        if(ans == 0){
            System.out.println("It is a Power of 2!!");

        }
        else{
            System.out.println("Fuck You!!");
        }
    }
}
