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
    public ArrayList<Integer> postorderTraversal(TreeNode a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(a == null)
            return result;
        TreeNode node = a;
        while(!stack.isEmpty() || node != null){
            while(node != null){
                if(node.right != null)
                    stack.push(node.right);
                stack.add(node);
                node = node.left;
            }
            node = stack.pop();

            if(node.right != null && !stack.isEmpty() && node.right == stack.peek()){
                TreeNode rightNode = stack.pop();
                stack.push(node);
                node = rightNode;
            }
            else{
                result.add(node.val);
                node = null;
            }
        }
        return result;
    }
}
