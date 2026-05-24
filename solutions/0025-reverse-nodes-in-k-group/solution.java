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
    private static void reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
}
    private ListNode getKthNode(ListNode curr, int k) {
        k -= 1;
        while(curr != null && k > 0) {
            k--;
            curr = curr.next;
        }
        return curr;
        
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null;

        while(temp != null) {
            ListNode kThNode = getKthNode(temp, k);
            if (kThNode == null) {
                if (prevLast != null) prevLast.next = temp; 
                break;
            }

            ListNode nextNode = kThNode.next;
            kThNode.next = null;

            reverse(temp);
            if (temp == head) {
                head = kThNode;
            }
            else {
                prevLast.next = kThNode;
            }

            prevLast = temp;
            temp = nextNode;

        }

        return head;
    }
}
