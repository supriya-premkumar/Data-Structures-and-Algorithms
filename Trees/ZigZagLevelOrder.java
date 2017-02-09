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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(a == null)
            return result;

        boolean leftToRight = true;

        int currentLevel = 1;
        int nextLevel = 0;

        queue.offer(a);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            currentLevel--;
            if(leftToRight)
                list.add(node.val);
            else
                list.add(0, node.val);

            if(node.left != null){
                queue.offer(node.left);
                nextLevel++;
            }
            if(node.right != null){
                queue.offer(node.right);
                nextLevel++;
            }

            if(currentLevel == 0){
                currentLevel = nextLevel;
                nextLevel = 0;
                leftToRight = !leftToRight;
                result.add(list);
                list = new ArrayList<Integer>();
            }
        }
        return result;
    }
}
