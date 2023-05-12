package BitWise;

public class RangeXOR {
    public static void main(String[] args) {
// range xor a till b
        int a  =  3;
        int b = 9;
       int ans  =  XOR(b)  ^ XOR(a-1);
        System.out.println(ans);
    }
//    This will give xor from 0 ot  a
    static int XOR(int a )
    {
        if(a%4==0)
        {
            return a;
        }
        else if (a%4==1){
            return 1;
        }
        else if(a%4==2)
        {
            return a + 1;
        }
        else {
            return 0;
        }
    }
}
