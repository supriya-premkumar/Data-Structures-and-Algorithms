/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

 Balanced tree : a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 Example :


 Given A : [1, 2, 3]
 A height balanced BST  :

 2
 /   \
 1     3

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
    public TreeNode sortedArrayToBST(final List<Integer> a) {
        if(a==null || a.size()==0){
            return null;
        }
        return balancedBST(a, 0, a.size()-1);
    }

    public TreeNode balancedBST(final List<Integer> a, int start, int end){
        int rootValue;
        if(start>end){
            return null;
            //since given array is sorted in ascending order
        }

        if(a.size() % 2 !=0){
            rootValue = (start + end)/2;
        }else{
            rootValue = Math.round((start+end)/2);
        }

        TreeNode root = new TreeNode(a.get(rootValue));
        root.left = balancedBST(a, start, rootValue-1);
        root.right = balancedBST(a, rootValue+1, end);
        return root;

    }
}
