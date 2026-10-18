/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        p = find(root,p.val);
        q = find(root, q.val);
        
        if(q == null || p == null) return null;

        if(find(p, q.val) != null) return p;
        if(find(q, p.val) != null) return q;

        return dfind(root, p.val, q.val);
    }


    private TreeNode find(TreeNode root, int node){
        if(root == null) return null;

        if(root.val == node) return root;

        TreeNode left = find(root.left, node);
        return left == null ? find(root.right, node) : left;
    }

    private TreeNode dfind(TreeNode root, int left, int right){
        if(root == null) return null;

        if(find(root.left, left)!= null && find(root.right, right) != null) return root;
        if(find(root.right, left)!= null && find(root.left, right) != null) return root;

        TreeNode result = dfind(root.left, left, right);

        return result == null? dfind(root.right, left, right): result;

    }
}
