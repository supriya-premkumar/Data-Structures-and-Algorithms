public class MergeTwoSortedLists{
    public static void main(String[] args){
    }

    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode newNode = new ListNode(0);
        ListNode node = newNode;

        while(a!=null || b!=null){
            if(a!=null && b!= null){
                if(a.val < b.val){
                    node.next = a;
                    a = a.next;
                }else{
                    node.next = b;
                    b = b.next;
                }
                node = node.next;
            }else{
                if(a == null){
                    node.next = b;
                    b = b.next;
                    break;
                }
                if(b==null){
                    node.next = a;
                    a=a.next;
                    break;
                }
            }

        }
        return newNode.next;
    }
}

public class ListNode {
    public ListNode next;
    public int val;

    ListNode(int data){
        val = data;
        next = null;
    }
}