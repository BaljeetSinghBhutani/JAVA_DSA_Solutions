package Stacks_and_Queues;

public class Queue_main {
    public static void main(String[] args) {
        Custom_Queue queue = new Custom_Queue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);

try {
    System.out.println(queue.remove());
}
catch (Queue_Exception e)
{
    System.out.println("Queue has became Empty");
}
        queue.display();

    }
}
