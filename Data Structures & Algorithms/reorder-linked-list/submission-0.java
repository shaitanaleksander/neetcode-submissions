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
    public void reorderList(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

      

        ListNode revers = null;

        while(slow != null){

            ListNode temp = slow.next;
            slow.next = revers;
            revers = slow;
            slow = temp;

        }

       
       ListNode dum = new ListNode();
        
        while(revers != null && head != null){
            
            dum.next = head;
            ListNode t = head.next;
            dum = dum.next;
            dum.next = revers;
            revers = revers.next;
            dum = dum.next;
            head = t;
        }
         dum.next = null;
    }

    private void print(ListNode node){

        while(node != null){

         System.out.println(node.val);
            node = node.next;
        }

    }
}
