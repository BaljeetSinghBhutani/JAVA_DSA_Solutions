package com.codewithkunalkushwaha;

public class Find_smallest_Character_Greater_than_the_target {

    public static char nextGreatestLetter(char[] letters, char target) {
//
        int startIndex = 0;
        int EndIndex = letters.length-1;

        while (startIndex<=EndIndex)
        {
            int mid = (startIndex + EndIndex)/2;
//
             if(target<letters[mid])
            {
                EndIndex = mid-1;

            }
            else{
                startIndex = mid+1;

            }

        }
        if(startIndex== letters.length)
        {
            return letters[0];
        }
return letters[startIndex];
    }

    public static void main(String[] args) {
char letter[] = {'c', 'f', 'j'};
char target = 'k';
char c = nextGreatestLetter(letter, target);
        System.out.println(c);

    }
}
