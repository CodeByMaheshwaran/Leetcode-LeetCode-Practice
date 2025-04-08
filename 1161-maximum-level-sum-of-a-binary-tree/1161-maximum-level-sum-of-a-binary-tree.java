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
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;
        int maxSum=Integer.MIN_VALUE;
        int maxLevel=0;
        int currLevel=1;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            int sum=0;
            for(int i=0;i<size;i++){
             TreeNode currNode=queue.poll();
             sum+=currNode.val;
             if(currNode.left!=null) queue.add(currNode.left);
             if(currNode.right!=null) queue.add(currNode.right);
           }
           if(sum >maxSum){
            maxSum=sum;
            maxLevel=currLevel;
           }
           currLevel++;
        }
           
    return maxLevel;       
    }
}