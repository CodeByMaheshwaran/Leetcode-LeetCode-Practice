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
    public int maxDepth(TreeNode root) {
          
          if (root == null) {
            return 0; // An empty tree has depth 0
        }
          Queue<TreeNode> elementQueue = new LinkedList<>();
          elementQueue.add(root);
          int numberOfLevels=0;
          while(!elementQueue.isEmpty()){
            //Maintain a count of node at each Level
            int nodeCountAtlevel=elementQueue.size();
            if(nodeCountAtlevel==0){
               //If we find no node at level, it means tree has ended, so return  
                return numberOfLevels;
            }
            //Dequeue all the nodes present at a particular level and add it to a queue
            while(nodeCountAtlevel>0){
                TreeNode element=elementQueue.poll();
                if(element.left!=null){
                   elementQueue.add(element.left) ;
                }
                if(element.right!=null){
                   elementQueue.add(element.right); 
                }
              nodeCountAtlevel--;  
            }
           numberOfLevels++; 
          }
    return numberOfLevels;      
    }
}