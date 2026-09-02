/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        Map<Node, Node> map = new HashMap<>();
        Node main = head;
        Node copy = new Node(-1);
        Node temp = copy;

        while(main != null ){
            temp.next = new Node (main.val);
            temp = temp.next;
            map.put(main, temp);
            main = main.next;
        }
        
        main = head;
        temp = copy.next;

        while(main != null){

            Node random = map.get(main.random);
            temp.random = random;
            main = main.next;
            temp = temp.next;
        }




        return copy.next;
    }
}
