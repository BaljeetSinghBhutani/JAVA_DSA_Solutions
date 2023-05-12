package StringRevision;

public class String_Pool {
    public static void main(String[] args) {

//        Method -2


        String str = "pqrs";

        for (int length = 1; length <= str.length(); length++) {
            for (int start = 0; start <= str.length() - length; start++) {
                int end = start + length - 1;
                System.out.println(str.substring(start, end+1));
            }
        }



    }
}




//        Method -1

//    String str = "pqrs";
//    int count  = 0;
//    for(int i =0; i<str.length();i++)
//    {
//        for(int j =i; j<str.length(); j++)
//        {
//            System.out.println(str.substring(i, j+1));
//            count++;
//        }
//    }
//        System.out.println(count);
//
//    }

