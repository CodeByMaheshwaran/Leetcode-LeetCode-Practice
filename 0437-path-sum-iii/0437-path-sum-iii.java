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
    private int pathSumWithRoot(TreeNode root, int sum) {
        if (root == null)
            return 0;
        int result = 0;
        if (root.val == sum)
            result++;
        result += pathSumWithRoot(root.left, sum - root.val);
        result += pathSumWithRoot(root.right, sum - root.val);
        return result;
    }

    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return 0;
    return pathSum(root.left,targetSum)+pathSumWithRoot(root,targetSum)+pathSum(root.right,targetSum);
    }
}