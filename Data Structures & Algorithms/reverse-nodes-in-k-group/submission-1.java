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

        while (true) {

            int counter = k;

            while (right != null && counter != 0) {
                right = right.next;
                counter--;
            }

            if (counter != 0) {
                 ListNode temp = start;
                while(temp.next != null) temp = temp.next;
                temp.next = left;
                break;
            }
           

            ListNode r = null;

            while (left != right) {
                ListNode temp = left.next;
                left.next = r;
                r = left;
                left = temp;
            }
            // r is the start of reversed list, left and right is the end of it;
           
            System.out.println(r.val);
            if(start == null) start = r;

            else {
                ListNode temp = start;
                while(temp.next != null) temp = temp.next;
                temp.next = r;
            }

        }

        return start;
    }
}
