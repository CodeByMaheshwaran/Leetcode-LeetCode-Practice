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
class BSTIterator {
    Stack<TreeNode> order= new Stack<>();
    public BSTIterator(TreeNode root) {
        partialInorder(root);
    }
    void partialInorder(TreeNode node){
        while(node!=null){
            order.push(node);
            node=node.left;
        }
    }
    public int next() {
        TreeNode top=order.pop();
        partialInorder(top.right);
      return top.val;  
    }
    
    public boolean hasNext() {
      return !order.isEmpty();  
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */