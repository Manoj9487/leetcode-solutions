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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count = 0;

        ListNode tail2 = list2;

        while(tail2.next != null) {
            tail2 = tail2.next;
        }

        ListNode temp = list1;
        while(temp != null) {
            count++;
            if (count == a) {
                ListNode temp1 = temp;
                while(count != b + 1) {
                    temp = temp.next;
                    count++;
                }
                temp1.next = list2;
                tail2.next = temp.next;
                break;
            }
            temp = temp.next;
        }
        return list1;
    }
}
