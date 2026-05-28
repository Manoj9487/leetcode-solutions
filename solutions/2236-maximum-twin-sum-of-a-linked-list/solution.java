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
    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode temp = head;

        while(temp != null) {
            ListNode nextNode = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = nextNode;
        }
        return prevNode;
    }
    public int pairSum(ListNode head) {

        ListNode middle = findMiddle(head);

        ListNode reverse = reverseList(middle);

        int sum = 0;
        ListNode temp = head;

        while(reverse != null) {
            if (temp.val + reverse.val > sum) {
                sum = temp.val + reverse.val;
            }
            temp = temp.next;
            reverse = reverse.next;
        }
        return sum;
    }
}
