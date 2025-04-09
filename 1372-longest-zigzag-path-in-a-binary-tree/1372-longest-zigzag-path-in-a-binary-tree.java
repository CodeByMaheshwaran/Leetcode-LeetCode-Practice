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
    int maxPath=0;
    public int longestZigZag(TreeNode root) {
        int count=0;
        char prevMove='l'; // which represent left 
        dfs(root, count,prevMove);
    return maxPath;    
    }
    private void dfs(TreeNode root,int count, char prevMove){
        if(root==null) return;
        maxPath=Math.max(maxPath,count);
        if(prevMove =='l'){ // previous move which is node from left 
            dfs(root.left,1,'l');
            dfs(root.right,count+1,'r');
        }else{
            dfs(root.right,1,'r');
            dfs(root.left,count+1,'l');
        }
    }
}