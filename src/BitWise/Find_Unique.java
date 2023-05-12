package BitWise;

public class Find_Unique {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4,1, 2, 1, 3, 6, 4 };
        int a =  arr[0];
        for(int i = 1; i<arr.length; i++)
        {
            a ^=arr[i];
        }
        System.out.println(a);
    }
}
