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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        //not root value means no value
        if (root ==null) return false;
        
        // suppose target sum is 0 and if it is leaf node the that is the path
        if(root.left==null && root.right==null && targetSum-root.val==0) return true;
        
    //if the root node is not giving the output then return back and check with other part 
        //left part and right part with decrese the root value
        //may be finally meet the target
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }
}