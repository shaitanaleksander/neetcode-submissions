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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(search(root.left,p) && search(root.left, q)){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if (search(root.right,p) && search(root.right, q)){
              return lowestCommonAncestor(root.right, p, q);
        }
        else return root;
    }

    private boolean search(TreeNode root, TreeNode node){
        if(root == null) return false;
        if(root.val == node.val) return true;
        
        if (root.val >  node.val) return search(root.left, node);
        else  return search(root.right, node);
    }
}
