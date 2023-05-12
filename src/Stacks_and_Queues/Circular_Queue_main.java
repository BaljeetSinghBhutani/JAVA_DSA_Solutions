package Stacks_and_Queues;

public class Circular_Queue_main {
    public static void main(String[] args) throws Queue_Exception {
        Circular_Queue queue = new Circular_Queue();
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);


        System.out.println(queue.remove());
        queue.display();
        queue.insert(45);
        queue.display();

    }
}
