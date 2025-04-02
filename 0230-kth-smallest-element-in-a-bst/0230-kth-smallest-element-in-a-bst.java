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
    int count;
    int result;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        kthSmallestUntil(root);
        return result;
    }

    public void kthSmallestUntil(TreeNode root) {
        if (root == null)
            return;
        kthSmallestUntil(root.left);
        count -= 1;
        if (count == 0) {
            result = root.val;
            return;
        }
        kthSmallestUntil(root.right);
        return;
    }
}