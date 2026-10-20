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



    public int equalToDescendants(TreeNode root) {
        
        List<TreeNode> list = new ArrayList<>();
        if(root == null) return 0;
        int result = 0;
        Map<TreeNode, Integer> sums = new HashMap<>(); 

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node);
            if(node.left != null) queue.offer(node.left);
            if(node.right != null) queue.offer(node.right); 
        }

            Collections.reverse(list);



            for(TreeNode node: list){
                
                int left  = sums.getOrDefault(node.left, 0);
                int right  = sums.getOrDefault(node.right, 0);

                if( (left + right) == node.val) result++;

                sums.put(node,left+ right+node.val);
            }

            return result;
    }
} // 12 4 1 3 4
