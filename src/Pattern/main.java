package Pattern;

public class main {
//    Pattern - 2
    static void Pattern2(int n)
    {
for(int i=0; i<n; i++)
{
    for(int j =0; j<=i; j++)
    {
        System.out.print("* ");
    }
    System.out.println();
}
    }

//    Pattern - 3

    static void Pattern3(int n)
    {
        for(int i =1; i<=n; i++)
        {
            for(int j =  n-i; j>=0; j--)
            {
                System.out.print("X");
            }
        }
    }
    public static void main(String[] args) {
Pattern2(5);

    }
}
