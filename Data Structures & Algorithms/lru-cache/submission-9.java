class LRUCache {
public class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

    private Map<Integer,Node> pool;
    private Node head;
    private Node tail;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.pool = new HashMap<>();
        this.tail = null;
        this.head = null;
        
    }
    
    public int get(int key) {

        if(!pool.containsKey(key)) return - 1;

        Node node = pool.get(key);
        if(node == head) return node.val;

        Node prev = node.prev;
        Node next = node.next;
        node.prev = null;
        prev.next = next;
        if(next != null) next.prev = prev;
        if(node == tail) tail = prev;

        node.next = head;
        head.prev = node;
        head = node;

        return node.val;
    }
    
    public void put(int key, int value) {

        if(pool.containsKey(key)){
            
            Node node = pool.get(key);
            node.val = value;

            if(node != head)  {
                Node prev = node.prev;
                Node next = node.next;
                node.prev = null;
                prev.next = next;
                  if(next != null) next.prev = prev;
                tail = node == tail? prev: tail;
                node.next = head;
                head.prev = node;
                head = node;
            }
        }
        else {

            Node node = new Node(key, value);
            pool.put(key, node);

            if(head == null){
                head = node;
                tail = node;
            }
            else{
                node.next = head;
                head.prev = node;
                head = node;
            }

            if(pool.size() > capacity){
                Node prev = tail.prev;
                tail.prev = null;
                prev.next = null;
                pool.remove(tail.key);
                tail = prev;
            }
        }   
    }


}
