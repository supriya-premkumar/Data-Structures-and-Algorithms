/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode a) {
        if(a == null || a.next == null){
            return a;
        }

        ListNode node = new ListNode(-1);
        node.next = a;

        ListNode preNode = node;
        ListNode currentNode = a;
        ListNode postNode = currentNode.next;


        while(currentNode!=null && postNode!= null){
            while(postNode!= null && postNode.val == currentNode.val){
                postNode = postNode.next;
            }

            if(postNode == null){
                if(currentNode.next == null){
                    return preNode;
                }else{
                    preNode.next = null;
                    return node.next;
                }
            }
            else{
                if (currentNode.next==postNode){
                    preNode=currentNode;
                    currentNode=postNode;
                    postNode=postNode.next;
                }
                else{
                    postNode.next=postNode;
                    currentNode=postNode;
                    postNode=currentNode.next;
                }
            }
        }

        return node.next;
    }
}
