/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode a) {
        ListNode pointer1 = a;
        ListNode pointer2 = a;

        boolean isCyclic = false;
        while(pointer1 != null && pointer1.next !=null && pointer2!=null){
            pointer1 = pointer1.next.next;
            pointer2 = pointer2.next;

            if(pointer1 == pointer2){
                isCyclic = true;
                break;
            }
        }

        if(!isCyclic){
            return null;
        }
        else{
            pointer1 = a;
            while(pointer1 != pointer2){
                pointer1 = pointer1.next;
                pointer2 = pointer2.next;
            }
            return pointer1;
        }
    }
}
