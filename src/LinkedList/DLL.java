package LinkedList;

public class DLL {

private Node head;


//    Class Node
   private class Node{
       int val;
       Node prev;
       Node next;

       public Node(int val) {
           this.val = val;
       }

       public Node(int val, Node prev, Node next) {
           this.val = val;
           this.prev = prev;
           this.next = next;
       }

   }

//   Insert in the FirstNode

   public void insertFirstNode(int val)
   {
       Node node = new Node(val);
       node.next = head;
       node.prev = null;
       if(head!=null) {
           head.prev = node;
       }
       head = node;
   }


//   Insert in the Last Node

public void insertLastNode(int val)
{

    Node node = new Node(val);
    node.next = null;
    if(head==null)
    {
     insertFirstNode(val);
     return;
//or
//    node.prev = null;
// //    node.next = null;
//    head  = node;

    }
    Node last = head;
    while(last.next!=null)
    {
        last = last.next;

    }

    last.next = node;
    node.prev = last;

}

//Insert after a particular value

//    Function to find node after a value

    public Node find(int value)
    {
        Node node  = head;
        while(node!=null)
        {
            if(node.val == value)
            {
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public void insert(int after,int val )
    {
Node p  = find(after);
if(p==null)
{
    System.out.println("Node not found!!");
    return;
}

Node node  = new Node(val);
node.next = p.next;
p.next = node;
node.prev = p;
if(node.next!=null)
{
    node.next.prev = node;
}
    }

//   display

    public void display()
    {
        Node node = head;
        Node tail =  null;
        while(node!=null)
        {
            System.out.print(node.val + " -> ");
            tail = node;
            node = node.next;
        }
        System.out.println("null");


        System.out.println("Print in Reverse!!");

        while (tail!=null)
        {
            System.out.print(tail.val + " -> ");
            tail = tail.prev;
        }
        System.out.println("null");
    }

}
