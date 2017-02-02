/**
 *
 *Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 *You should preserve the original relative order of the nodes in each of the two partitions.
 *
 *For example,
 *
 Given 1->4->3->2->5->2 and x = 3,
 return 1->2->2->4->3->5.

 **/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode a, int b) {
        if(a==null){
            return null;
        }

        ListNode h1 = new ListNode(0);
        ListNode h2 = new ListNode(0);
        h1.next = a;

        ListNode curr = a;
        ListNode prev = h1;
        ListNode post = h2;

        while(curr!=null){
            if(curr.val < b){
                curr = curr.next;
                prev = prev.next;
            }else{
                post.next = curr;
                prev.next = curr.next;

                curr = prev.next;
                post = post.next;
            }
        }

        post.next = null;

        prev.next = h2.next;
        return h1.next;


    }
}
