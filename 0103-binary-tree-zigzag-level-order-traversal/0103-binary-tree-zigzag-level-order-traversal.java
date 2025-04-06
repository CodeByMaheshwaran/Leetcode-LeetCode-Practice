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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigzag = new ArrayList<>();
        if (root == null)
            return zigzag;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();
            Stack<Integer> reverseStack = new Stack<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currNode = queue.poll();
                //check flag
                if (flag) {
                    reverseStack.add(currNode.val);
                } else {
                    level.add(currNode.val);
                }
                if (currNode.left != null)
                    queue.add(currNode.left);
                if (currNode.right != null)
                    queue.add(currNode.right);
            }
            flag = !flag;
            //Pop all the Elements from Stack
            while (!reverseStack.isEmpty()) {
                level.add(reverseStack.pop());
            }
            zigzag.add(level);
        }
        return zigzag;
    }
}