package BitWise;

public class Set_Bits {
    public static void main(String[] args) {
        int n = 234567;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.bitCount(n));

        System.out.println(setBits(n));
        System.out.println(5 ^ 6);
   }

    private static int setBits(int n) {
        int count  = 0;

        while(n>0){
            n = n & (n-1);
            count++;
        }
        return count;
    }


}
