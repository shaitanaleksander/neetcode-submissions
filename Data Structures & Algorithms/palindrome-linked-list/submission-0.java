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
    public boolean isPalindrome(ListNode head) {
        
        ListNode rhead = new ListNode();
        ListNode temp = head;

        while(temp != null){
            rhead.val =  temp.val;
            ListNode t = new ListNode();
            t.next = rhead;
            rhead = t;
            temp = temp.next;
        }
        
       rhead = rhead.next;
        temp = head;

        while(temp != null){
            System.out.println(temp.val +"  "  + rhead.val);

            if(temp.val != rhead.val) return false;

            temp = temp.next;
            rhead = rhead.next;
        }

        return true;

    }
}