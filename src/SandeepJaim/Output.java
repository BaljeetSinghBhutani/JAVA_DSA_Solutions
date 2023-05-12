package SandeepJaim;

public class Output {

    static void printInFormat(float a, float b){
        float result = a/b;

        System.out.print(result + " ");
        // Your code here to print upto 3 decimal places
        System.out.format("%.3f" , result);


    }
    public static void main(String[] args) {
//        int x = 100;
//        int y = 200;
//        System.out.format("Value of x is %d\n", x);
//        System.out.printf("x = %d, y = %d", x, y);

        double y1  = Math.PI;
        System.out.println(y1);
//
        System.out.format("value of PI is %.2f\n", y1);
//        System.out.format("value of PI is %05.2f\n", y1);
//        System.out.format("value of PI is % 5.2f\n", y1);

     printInFormat(5.43F, 2.653F);
    }
}
