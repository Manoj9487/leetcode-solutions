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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next, first0 = head;

        while(temp != null) {
            int sum = 0;
            while(temp.val != 0) {
                sum += temp.val;
                temp = temp.next;
            }
            first0.val = sum;
            if (temp.next != null) {
                first0.next = temp;
                first0 = first0.next;
            }
            temp = temp.next;
        }
        first0.next = null;
        return head;
    }
}
