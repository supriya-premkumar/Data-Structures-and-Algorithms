/**
 * Given a singly linked list, modify the value of first half nodes such that :

 1st node’s new value = the last node’s value - first node’s current value
 2nd node’s new value = the second last node’s value - 2nd node’s current value,
 and so on …

 NOTE :
 * If the length L of linked list is odd, then the first half implies at first floor(L/2) nodes. So, if L = 5, the first half refers to first 2 nodes.
 * If the length L of linked list is even, then the first half implies at first L/2 nodes. So, if L = 4, the first half refers to first 2 nodes.
 Example :

 Given linked list 1 -> 2 -> 3 -> 4 -> 5,

 You should return 4 -> 2 -> 3 -> 4 -> 5
 as

 for first node, 5 - 1 = 4
 for second node, 4 - 2 = 2
 Try to solve the problem using constant extra space.
 */

/**
 * Definition for singly-linked list.
 *
 */

import java.util.Scanner;

class ListNode {
      public int val;
      public ListNode next;

      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class Checkpoint4_Subtract{

    public ListNode subtract(ListNode A) {
        ListNode middle = A;
        ListNode last = null;


        ListNode curr = A;
        while (curr.next != null) {
            last = curr.next;

            if (last.next != null) {
                last = last.next;

            } else {
                break;
            }
            middle = middle.next;
            curr = last;
        }
        middle = middle.next;

        ListNode B = null;

        if (middle != null) {
            B = new ListNode(middle.val);
            while (middle.next != null) {
                middle = middle.next;
                ListNode tmp = new ListNode(middle.val);
                tmp.next = B;
                B = tmp;
            }
        }

        ListNode start = A;
        ListNode tmp = B;
        while (tmp != null) {
            start.val = tmp.val - start.val;
            tmp = tmp.next;
            start = start.next;
        }

        return A;
    }

}