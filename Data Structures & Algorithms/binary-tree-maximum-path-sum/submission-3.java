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

    private int result = Integer.MIN_VALUE;


    public int maxPathSum(TreeNode root) {
        
        dive(root);
        return result;    
    }


    private int dive(TreeNode node) {
        if(node == null) return 0;

        int left  = dive(node.left);
        int right = dive(node.right);

        int total = node.val;
        int tval = 0;

        if(left > 0 && right > 0 ){
            total +=  left + right;
            tval += left > right? left : right;
        }
        else if(left >  0){
            total += left;
            tval+= left;
        }
        else if (right > 0){
            total += right;
            tval+= right;
        }

        result = result > total? result : total;

        return node.val + tval;
    }

}
