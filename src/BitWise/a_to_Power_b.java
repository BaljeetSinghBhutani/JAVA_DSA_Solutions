package BitWise;

public class a_to_Power_b {
    public static void main(String[] args) {

//       Time Complexity is Log(power)
        int base  = 3;
        int power = 6;
        int ans  = 1;
        while(power>0){
            int n  = power & 1;
            if(n!=0){
                ans  = ans * base;
            }
            base =  base * base;
            power =  power >>1;
        }

        System.out.println(ans);
    }
}
