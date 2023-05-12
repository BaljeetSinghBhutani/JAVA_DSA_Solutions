package Generics;

import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
      for(int i =0; i<5; i++)
      {
        list.add(i);
      }

//       list.forEach((item)-> System.out.print(item + " "));
        Operation sum  = (a, b) ->  a + b;
        Operation sub  = (a, b) ->  a - b;
        Operation mul  = (a, b) ->  a * b;
        Operation div  = (a, b) ->  a / b;

        LambdaFunctions calcuator  = new LambdaFunctions();
        System.out.println(calcuator.operate(1, 2, sub));

    }

   private int operate(int a, int b, Operation  op){
      return op.operation(a, b);
    }

}
interface Operation{
    int operation(int a, int b);
}
