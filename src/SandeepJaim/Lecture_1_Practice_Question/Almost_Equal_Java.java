package SandeepJaim.Lecture_1_Practice_Question;

import java.util.Arrays;

public class Almost_Equal_Java {

    static int coutChars(String s1, String s2)
    {
      int freq1[] = new int[26];
      int freq2[] =  new int[26];
int count = 0;

      for(int i = 0; i<s1.length(); i++)
      {
          int a = s1.charAt(i)-'a';
          freq1[a]++;
      }

      for(int i = 0; i<s2.length(); i++)
      {
          int a = s2.charAt(i)-'a';
          freq2[a]++;
      }


      for(int i =0; i< freq1.length; i++)
      {
          count+= Math.abs(freq1[i]-freq2[i]);
      }

return count;
     }
    public static void main(String[] args) {

    }
}
