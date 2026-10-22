class Solution {

    private Set<Integer> remove = new HashSet<>();
    private List<TreeNode> result = new ArrayList<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        for(int i: to_delete) remove.add(i);
        root = dive(root);
        if(root != null) result.add(root);
        return result;

    }


    private TreeNode dive(TreeNode node) {
        if(node == null) return null;


        TreeNode left = dive(node.left);
        TreeNode right = dive(node.right);

        if(remove.contains(node.val)){

            if(left != null) result.add(left);
            if(right != null) result.add(right);
            return null;
        }

        node.left = left;
        node.right = right;
        return node;

    }
}
