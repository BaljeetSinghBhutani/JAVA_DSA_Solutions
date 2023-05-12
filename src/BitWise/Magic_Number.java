package BitWise;

public class Magic_Number {
    static int magicNumber(int n){
        int ans = 0;
        int base = 5;
        int count  = 1;
        while(n>0){
            int last = n & 1;
            n = n>>1;

            ans +=Math.pow(base, count) * last;
            count++;

        }


        return ans;


    }

    public static void main(String[] args) {

     int ans =  magicNumber(5);
        System.out.println(ans);
    }
}
