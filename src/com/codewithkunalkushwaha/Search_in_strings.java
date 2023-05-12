package com.codewithkunalkushwaha;

import java.util.Arrays;

public class Search_in_strings {
    public static boolean search(String str, char target)
    {
  if(str.length()==0)
  {
      return false;
  }

  for(int i =0;i<str.length(); i++)
  {
      if(target==str.charAt(i))
      {
      return true;
      }
  }
  return false;
    }

      public static boolean search2(String str, char target)
    {
  if(str.length()==0)
  {
      return false;
  }

        for (char ch: str.toCharArray() ){
            if(ch==target)
            {
                return true;
            }
        }
  return false;
    }



    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name, target));

    }
}
