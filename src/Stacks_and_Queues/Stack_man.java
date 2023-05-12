package Stacks_and_Queues;

import java.util.Stack;

public class Stack_man {
    public static void main(String[] args) throws Stack_Exception {
      Custom_Stack stack = new DynamicStack();
//        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(28);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        try {
            System.out.println(stack.pop());

        }
        catch (Stack_Exception e)
        {
            System.out.println("Stack is Empty cannot pop from it");
        }
    }
}
