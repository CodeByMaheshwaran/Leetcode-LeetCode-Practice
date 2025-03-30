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
    Map<Integer,Integer> map= new HashMap<>();
    int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex= postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        } 
    return build(inorder,postorder,0,inorder.length-1);    
    }
    public TreeNode build(int[] inorder, int[]postorder, int start,int end){
        if(start>end){
            return null;
        }
        TreeNode root= new TreeNode(postorder[postIndex--]);
        if(root==null){
            return null;
        }
        if(start==end){
            return root;
        }
        int index= map.get(root.val);
        root.right=build(inorder,postorder,index+1,end);
        root.left=build(inorder,postorder,start,index-1);
        
    return root;
    }
}