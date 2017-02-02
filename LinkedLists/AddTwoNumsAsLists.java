//You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//
//        342 + 465 = 807
//        Make sure there are no trailing zeros in the output list
//        So, 7 -> 0 -> 8 -> 0 is not a valid response even though the value is still 807.
//


/**
 * Definition for singly-linked list.
 * */
  class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }



public class AddTwoNumsAsLists{
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        ListNode newHead = new ListNode(0);
        ListNode head = newHead;
        int carry = 0;
        while(a != null && b != null){
            int sum = a.val + b.val + carry;

            head.next  = new ListNode(sum % 10);
            carry = sum / 10;

            a = a.next;
            b = b.next;
            head = head.next;
        }
        while(a != null){
            int sum = a.val + carry;
            head.next  = new ListNode(sum % 10);
            carry = sum / 10;
            a = a.next;
            head = head.next;
        }

        while(b != null){
            int sum = b.val + carry;
            head.next  = new ListNode(sum % 10);
            carry = sum / 10;
            b = b.next;
            head = head.next;
        }
        if(carry != 0){
            head.next  = new ListNode(carry);
        }
        return newHead.next;

    }
}