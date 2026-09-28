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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root  == null) return false;

        if(root.val == subRoot.val && isSub(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }


    private boolean isSub( TreeNode root, TreeNode subroot){
        if(root == null && subroot == null) return true;
        if((root == null && subroot != null) || (root != null && subroot == null)) return false;
        if(root.val != subroot.val) return false;
        return isSub(root.left, subroot.left) && isSub(root.right, subroot.right);
    }
}
