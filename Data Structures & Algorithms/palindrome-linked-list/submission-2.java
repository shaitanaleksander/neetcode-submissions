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
        ListNode temp = head;
        int size = 0;

        while (temp != null) {
            temp = temp.next;
            size++;
        }
        int z = size;
        size = size % 2 == 0 ? size / 2 : size / 2 + 1;
        


        temp = new ListNode();
        while(size > 0){

            ListNode t = head.next;
            head.next = temp;
            temp = head;
            head = t;
            size--;
        }

        if(z%2 != 0) temp = temp.next;

    while(head != null){
        if(temp.val != head.val) return false;
        temp = temp.next;
        head = head.next;
    }

        return true;

    }
}