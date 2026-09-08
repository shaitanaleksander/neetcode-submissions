/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        List<ListNode> pool = new ArrayList<>();

        for(int i = 0; i < lists.length; i++){

            ListNode temp = lists[i];
            
            while(temp != null) {
                pool.add(temp);
                temp = temp.next;
            }
        }

        pool.sort((a,b) -> a.val - b.val);

        if(pool.size() == 0) return null;

        ListNode head = pool.get(0);
        ListNode temp = head;

        for(int i = 1; i < pool.size(); i++){

            temp.next = pool.get(i);
            temp = temp.next;

        }

        return head;
    }
}
