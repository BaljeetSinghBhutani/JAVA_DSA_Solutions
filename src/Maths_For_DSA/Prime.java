package Maths_For_DSA;

public class Prime {
    public static void main(String[] args) {

    }
    static boolean isPrime(int n)
    {
        if(n<=1){
            return false;
        }

        int c =  2;
        while(c * c<=n) {    //  or c<=Math.sqrt(n)
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
