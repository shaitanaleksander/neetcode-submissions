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

        ListNode start = null;

        ListNode left = head;
        ListNode right = head;
        ListNode last = left;
        

        while (true) {
            
            int counter = k;

            while (right != null && counter != 0) {
                right = right.next;
                counter--;
            }
            
            

            if (counter != 0) {
                last.next = left;
                break;
            }
                       
            ListNode r = null;
            ListNode tl = left;

            while (left != right) {
                ListNode temp = left.next;
                left.next = r;
                r = left;
                left = temp;
            }
           
            if(start == null) start = r;
            else {
                last.next = r;
                last = tl;
                }
          
        }
        return start;
    }
}
