package Stacks_and_Queues;

public class Custom_Queue {
  private int[]data;
  private static final int DEAFULT_SIZE = 10;

  int end  =0;

  public Custom_Queue(){
      this(DEAFULT_SIZE);
  }
  public Custom_Queue(int size){
      this.data = new int [size];
  }

  public boolean isFull(){
  return end  == data.length;
  }

  public boolean isEmpty(){
      return end ==0;
  }

  public boolean insert(int item)
  {
      if(isFull())
      {
          return false;
      }
data[end++] = item;

return true;
  }

public  int remove() throws Queue_Exception
{
if(isEmpty())
{
    throw new Queue_Exception("Queue is Empty");

}
int remove= data[0];
//Shifting of the elements
for(int i =1; i<end; i++)
{
    data[i-1] = data[i];
}
    end--;
return remove;
}
public int front() throws Exception{
      if(isEmpty())
      {
          throw  new Queue_Exception("Queue is Empty");

      }

     return data[0];
}

public void display(){
      for(int i =0; i<end ; i++)
      {
          System.out.print(data[i] + " <-");
      }
    System.out.println("End");
}



}
