package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a  = 5;
        int b  =0;
        try {
      divide(a, b);
        }
        catch (CustomException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will always Execute!!");
        }
    }
    static int divide(int a, int b) throws CustomException{
        throw new CustomException("Please Do not divide by zero!! ");

    }
}
