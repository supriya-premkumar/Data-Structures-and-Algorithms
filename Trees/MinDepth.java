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
    public int minDepth(TreeNode a) {
        if(a==null){
            return 0;
        }
        if(a.left == null){
            return minDepth(a.right) + 1;
        }if(a.right == null){
            return minDepth(a.left) + 1;
        }
        else{
            return Math.min(minDepth(a.right) +1, minDepth(a.left)+1);
        }

    }
}
