class Solution {
    public TreeNode findNearestRightNode(TreeNode root, TreeNode u) {
        Queue<TreeNode> queue = new ArrayDeque<>();

        queue.offer(root);

        while (queue.size() > 0) {
            int size = queue.size();

            boolean found = false;

            while(size > 0){
                
                TreeNode node = queue.poll();

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);

                if(found) return node;
                if(node.val == u.val) found = true;
                size--;
            }
            
            if(found) return null;
        }
        return null; 
    }
}
