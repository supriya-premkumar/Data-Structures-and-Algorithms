/**
 *
 * Given a binary search tree, write a function to find the kth smallest element in the tree.

 Example :

 Input :
 2
 / \
 1   3

 and k = 2

 Return : 2

 As 2 is the second smallest element in the tree.
 NOTE : You may assume 1 <= k <= Total number of nodes in BST
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
    public int kthsmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode node = root;
        int res = 0;

        while(!stack.isEmpty() || node!=null){
            if(node!=null){
                stack.push(node);
                node = node.left;
            }else{
                TreeNode newNode = stack.pop();
                k--;
                if(k==0){
                    res = newNode.val;
                }else{
                    node = newNode.right;
                }
            }
        }
        return res;

    }
}
