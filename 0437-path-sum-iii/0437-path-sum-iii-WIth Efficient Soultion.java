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
    int counter=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
        pathSumHelper(root,targetSum,(long) 0);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
    return counter;    
    }
    private void pathSumHelper(TreeNode root, int targetSum, long currSum){
        if(root==null) return;
        currSum+=root.val;
        if(currSum==targetSum){
            counter++;
        }
        pathSumHelper(root.left,targetSum,(long) currSum);
        pathSumHelper(root.right,targetSum,(long) currSum);
    }
}