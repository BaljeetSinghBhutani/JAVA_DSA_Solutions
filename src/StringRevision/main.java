package StringRevision;

public class main  {

    public static String  ReverseString(String str)
    {
        String ans = "";
        for(int i =0; i<str.length(); i++)
        {
            ans =  str.charAt(i)+ ans;
        }
        return ans;

    }
    public static void main(String[] args) {
        String str1 = "Coding ";
        String str2 = "is fun";

//        str1 =  str1.concat(str2);
        System.out.println(str1);
        System.out.println(str1.equals(str2));
        System.out.println(str1.substring(2,5));


        System.out.println(ReverseString(str1));
    }
}
