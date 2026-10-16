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

    private List<Integer> result = new ArrayList<>();

    public List<Integer> getLonelyNodes(TreeNode root) {

        dive(root);
        return result;
    }


    private void dive(TreeNode node) {
       
        if((node.left != null && node.right == null) || (node.left == null && node.right != null)){
            result.add(node.left == null? node.right.val: node.left.val);
        };
        if(node.left != null) dive(node.left);
        if(node.right != null) dive(node.right);
    }
}
