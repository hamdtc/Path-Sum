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
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        //List<Integer> temp=new ArrayList<>();
        
        // root is null there is no need to search again
        if (root ==null ) return ans;
        
        //each list will add to ans
        checkPathSum(root,new ArrayList<Integer>(),targetSum);
        
        return ans;
    }
    public void checkPathSum(TreeNode root,List<Integer> temp, int target){
        if(root ==null){
            return;
        }
        temp.add(root.val);
        if(root.left==null && root.right== null && root.val==target) {
            ans.add(temp);
        }
        
        checkPathSum(root.left,new ArrayList(temp),target-root.val);
        checkPathSum(root.right,new ArrayList(temp),target-root.val);
    }
}

