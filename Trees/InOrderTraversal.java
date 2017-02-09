/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode a) {
        TreeNode node =a;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(a == null){
            return null;
        }

        while(!stack.isEmpty() || node!=null){
            if(node != null){
                stack.push(node);
                node = node.left;

            }else{
                node = stack.pop();
                list.add(node.val);
                node = node.right;
            }

        }
        return list;
    }
}
