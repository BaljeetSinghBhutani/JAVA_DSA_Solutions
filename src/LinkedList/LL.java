package LinkedList;


import java.util.List;

public class LL {

//     Node Members
private  Node head;
private  Node tail;
private int size;
    public LL() {

        this.size = 0;
    }



    //    Class Node
    private class Node{
        private int val;
        private Node next;

        public Node(int val) {

            this.val = val;
        }

// Constructor
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

    }

//    InsertFirstNode
public  void insertFirstNode(int val)
{
    Node node  = new Node(val);
    node.next = head;
    head = node;

    if(tail==null)
    {
        tail = head;

    }

    size++;
}

//Insert LastNode

public void insertLast(int val)
{
    Node node  = new Node(val);
    if(tail!=null)
    {
        tail.next = node;
        tail = node;
        size++;
    }
    else {
        insertFirstNode(val);
    }
}

//Insert In the Middle
public void insert(int val, int index)
{
    if(index == 0)
    {
        insertFirstNode(val);
    }

    else if(index==size)
    {
        insertLast(val);
    }

    else {
Node temp = head;
for(int i =0; i<index-1; i++)
{
    temp = temp.next;
}
Node newNode  = new Node(val, temp.next);
temp.next = newNode;
size++;
    }
}

public  Node insertIndex(int val, int index, Node node)
{
    if(index==0) {
Node temp = new Node(val,node);
size++;
return temp;
    }

    node.next = insertIndex(val, index-1, node.next);

    return node;
    }

//Insert in the linkedList recussively
public void insertRec(int val, int index)
{

head = insertIndex(val, index, head);

}


//Delete first Node

    public int deletefirstNode()
    {
        int val = head.val;
        head = head.next;
        if(head==null)
        {
            tail = null;
        }
        size--;

        return val;
    }

//    Delete Last Node
    public int deleteLast()
    {
        int val = tail.val;
        if(size<=1)
        {
            return  deletefirstNode();
        }

else {

            Node temp = getIndex(size - 2);
            tail = temp;
            tail.next = null;
            size--;
        }
return val;
    }

//    Delete Node
public int delete(int index)
{
    if(index ==0)
{
    return  deletefirstNode();
}
if(index == size -1)
    {
        return deleteLast();
    }

    Node prev = getIndex(index -1);
            int val = prev.next.val;
    prev.next= prev.next.next;
size--;
return val;
}


//Get Node with a given value
public Node getvalue(int value)
{
    Node node  = head;
  while(node!=null)
  {
      if(node.val ==value)
      {
          return node;
      }
      node = node.next;
  }
    return null;
}


    //    Get Index
    public Node getIndex(int index)
    {
        Node node  = head;
        for(int i = 0; i<index; i++)
        {
            node  = node.next;
        }
        return node;
    }




//Print

public void display()
{
    Node temp = head;
    while (temp!=null)
    {
        System.out.print(temp.val + " -> ");
        temp=temp.next;
    }
    System.out.println("Null");
}


// Question  - Merge two sorted Linked List






//     Question - get the middle element of the linked list

    ListNode getmid(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            fast = fast.next.next;
            slow =  slow.next;

        }

        return slow;

    }



}
