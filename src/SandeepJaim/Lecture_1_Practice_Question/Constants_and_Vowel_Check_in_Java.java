package SandeepJaim.Lecture_1_Practice_Question;

public class Constants_and_Vowel_Check_in_Java {
    static void checkString(String s)
    {
        int v=0;
        int c=0;

        //Your code here

        for(int i =0; i<s.length(); i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)== 'i' || s.charAt(i)== 'o' || s.charAt(i)== 'u')
            {
                v++;
            } else if (s.charAt(i)==' ') {

            }
            else{
                c++;
            }
        }


        if(v>c)
            System.out.print("Yes");
        else if(c>v)
            System.out.print("No");
        else
            System.out.print("Same");

        System.out.println();
    }
    public static void main(String[] args) {

    }
}
