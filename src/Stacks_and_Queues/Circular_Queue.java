package Stacks_and_Queues;

public class Circular_Queue {
    private int[]data;
    private static final int DEAFULT_SIZE = 10;

    int end  =0;
    int front  = 0;

private int size = 0;
    public Circular_Queue(){
        this(DEAFULT_SIZE);
    }
    public Circular_Queue(int size){
        this.data = new int [size];
    }

    public boolean isFull(){
        return size  == data.length;
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
        end  = end% data.length;
        size++;
        return true;
    }

    public int remove() throws Queue_Exception{
        if(isEmpty())
        {
            throw  new Queue_Exception("Queue is Empty!!");
        }
            int temp  = data[front];
        front++;
        front= front % size;
        size--;
        return temp;
    }
    public int front () throws Queue_Exception {
        if(isEmpty())
        {
            throw  new Queue_Exception("Queue is Empty!!");
        }
        return data[front];
    }
    public void display()
    {
        for(int i = front; i<end; i++)
        {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
