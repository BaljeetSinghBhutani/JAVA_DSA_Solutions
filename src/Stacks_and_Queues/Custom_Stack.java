package Stacks_and_Queues;

import java.util.EmptyStackException;

public class Custom_Stack {
  protected int[] data;
  private static final int DEAFULT_SIZE  = 10;

  int ptr  = -1;

  public Custom_Stack(int size){
    this.data  = new int [size];

  }

  public Custom_Stack(){
    this(DEAFULT_SIZE);
  }

  public boolean push(int item)
  {
    if(isFull())
    {
      System.out.println("Stack is full");
      return false;
    }
    ptr++;
    data[ptr] = item;

    return true;
  }

  public int pop() throws Stack_Exception {
    if(isEmpty()){
      throw new Stack_Exception("Cannot pop from an Empty Stack");
    }
return data[ptr--];
  }

  public int peek() throws Stack_Exception {
    if(isEmpty()){
         throw new Stack_Exception("Cannot peek from an Empty Stack");
    }

return data[ptr];
  }


  public boolean isFull() {
   return ptr  == data.length -1;
  }

public  boolean isEmpty() {
   return ptr ==-1;
  }


}
