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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        right = right - left;

        ListNode leftNode = new ListNode();
        leftNode.next = head;
        head = leftNode;


        while(left-- > 1 ) leftNode = leftNode.next;
        System.out.println(leftNode.val);

        

        ListNode temp = null;
        ListNode rightNode = leftNode.next;

        while(right >= 0){

            ListNode t = rightNode;
            rightNode = rightNode.next;
            t.next = temp;
            temp = t;
            right--;

        }
        
        leftNode.next = temp;

        while(leftNode.next != null) leftNode = leftNode.next;
        leftNode.next = rightNode;

        return head.next;
    }
}