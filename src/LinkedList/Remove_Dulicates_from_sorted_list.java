package LinkedList;
 class ListNode {
      int val;
     ListNode next;
         ListNode() {

         }
      ListNode(int val) {
             this.val = val;
         }
      ListNode(int val, ListNode next) {
             this.val = val;
             this.next = next;
         }
  }
public class Remove_Dulicates_from_sorted_list {
    public ListNode deleteDuplicates(ListNode head) {
ListNode node  = head;


while(node.next!= null)
{
    if(node.val==node.next.val)
    {
        node.next = node.next.next;
    }
    else{
        node  = node.next;
    }
}

return head;



    }
    public static void main(String[] args) {

    }
}
