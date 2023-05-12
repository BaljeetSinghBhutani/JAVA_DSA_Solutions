package SandeepJaim.Lecture_1_Practice_Question;

public class ThePattern_Matcher_Java {
    static void follPatt(String s)
    {
        int countx = 0;
        int county  =0;
        int i =0;
        while(i<s.length()){
            countx =0;
            county = 0;
            while (s.charAt(i) == 'x') {
                countx++;
                i++;
            }
            while (s.charAt(i) == 'y') {
                county++;
                i++;
            }

            if (countx != county){
                System.out.println("0");
                    return;
            }
        }
        System.out.println("1");

    }
    public static void main(String[] args) {

    }
}
