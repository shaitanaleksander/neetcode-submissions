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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        List<ListNode> collect = new ArrayList<>();

        while(head != null){
            collect.add(head);
            head = head.next;
        }


        int i = k;

        List<ListNode> reverse = new ArrayList<>();

        while(i <= collect.size()){
            
            int j = i - k;
            int c = i-1;

            while( j <= c){                
                reverse.add(collect.get(c));
                c--;
            }
            i += k;
        }

        i-=k;

        while(i < collect.size()){
            reverse.add( collect.get(i));
            i++;

        }

        ListNode temp = new ListNode();
        head = temp;

        for(int j = 0; j < reverse.size(); j++){
            temp.next = reverse.get(j);
            temp = temp.next;
        }

        temp.next = null;
        return head.next;
    }
}
