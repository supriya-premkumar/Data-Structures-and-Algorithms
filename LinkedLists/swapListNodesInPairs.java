/***
 *Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

 Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 **/
public class Solution {
    public ListNode swapPairs(ListNode a) {

        if(a==null || a.next == null){
            return a;
        }

        ListNode  node = new ListNode(0);
        node.next = a;
        ListNode val = node;

        while (val.next != null && val.next.next != null) {

            ListNode p1 = val;
            val = val.next;
            p1.next = val.next;

            ListNode p2 = val.next.next;
            val.next.next =val;
            val.next = p2;



//            val.next = swapNodes(val.next, val.next.next);
//            val = val.next.next;
        }
        return node.next;

    }

//    public ListNode swapNodes(ListNode p1, ListNode p2) {
//        p1.next = p2.next;
//        p2.next = p1;
//        return p2;
//    }
}