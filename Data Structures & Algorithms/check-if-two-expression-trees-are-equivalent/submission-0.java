// Node has char val, Node left, and Node right.
class Solution {


    public boolean checkEquivalence(Node root1, Node root2) { 

        StringBuilder node1 = new StringBuilder();
        StringBuilder node2 = new StringBuilder();
        dive(root1, node1);
        dive(root2, node2);

        char[] secv1 = node1.toString().toCharArray();
        char[] secv2 = node2.toString().toCharArray();

        Arrays.sort(secv1);
        Arrays.sort(secv2);
        if(secv1.length != secv2.length) return false;

        for(int i = 0; i< secv1.length; i++){

            if(secv1[i] !=secv2[i])return false;
        }

        return true; 
        
        }


    private void dive(Node node, StringBuilder builder){
        if(node.val != '+'){
            builder.append(node.val);
        }
        else {
            dive(node.left, builder);
            dive(node.right, builder);
        }
    }        
}
