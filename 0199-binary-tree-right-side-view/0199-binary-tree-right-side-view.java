/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> res = new ArrayList<>();
        rightSideHelper(root, 0, res);
        return res;
    }
    
    private void rightSideHelper(TreeNode node, int level, List<Integer> res) {
       if(node==null){
        return;
       }
       if(res.size()==level){
        res.add(node.val);
       }
       rightSideHelper(node.right,level+1,res);
       rightSideHelper(node.left,level+1,res);

    }
}