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
        List<Integer> result= new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
         int levelSize=queue.size(); //Number of Nodes in Current Level
         int lastValue=0; //Stores the last Node's Value of the Level 
         for(int i=0;i<levelSize;i++){
            TreeNode node=queue.poll();
            lastValue=node.val; // Update the Last Value with the Current Node
            //add the child nodes to queue for next level Processing
            if(node.left!=null)queue.offer(node.left);
            if(node.right!=null)queue.offer(node.right);
         }
         result.add(lastValue); // add the last node's value  of this level
        }
    return result;    
    }
}