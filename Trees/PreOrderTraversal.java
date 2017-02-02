/**
 * Given a binary tree, return the preorder traversal of its nodes’ values.

 Example :
 Given binary tree

 1
 \
 2
 /
 3
 return [1,2,3].

 Using recursion is not allowed.
 **/

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
    public ArrayList<Integer> preorderTraversal(TreeNode a) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        if(a==null){
            return null;
        }else{
            stack.push(a);
        }

        while(!stack.isEmpty()){
            TreeNode popNode = stack.pop();
            res.add(popNode.val);

            if(popNode.right != null){
                stack.push(popNode.right);
            }

            if(popNode.left != null){
                stack.push(popNode.left);
            }
        }

        return res;

    }
}
