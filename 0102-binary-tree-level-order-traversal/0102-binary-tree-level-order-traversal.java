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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        levelorder(root,0,res);
        return res;    
    }
    private void levelorder(TreeNode node,int level,List<List<Integer>>res){
        if(node==null){
            return;
        }
        if(res.size()==level){
            res.add(new ArrayList<>());
        }
        res.get(level).add(node.val);
        levelorder(node.left,level+1,res);
        levelorder(node.right,level+1,res);
    }
}