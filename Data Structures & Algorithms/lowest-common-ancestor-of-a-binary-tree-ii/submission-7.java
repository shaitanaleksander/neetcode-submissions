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

    private TreeNode answere = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        dive(root, p.val, q.val);
        return answere;

    }


    private boolean dive(TreeNode node, int first, int second){
        if(node == null) return false;

        boolean lt = dive(node.left, first, second);
        boolean rt = dive(node.right, first, second);

        if((node.val == first || node.val == second) && (lt || rt )){
            answere = node;
            return false;
        }
        if(lt && rt) answere = node;
        
        return (node.val == first || node.val == second) || (lt || rt);
    }
}
