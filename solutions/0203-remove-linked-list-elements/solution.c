/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {


    if (head == NULL) {
        return head;
    }
    while(head!= NULL && head->val==val){
            head = head->next;
    }
    struct ListNode* prev = NULL;
    struct ListNode* curr = head;
    while(curr != NULL) {
        if (curr->val == val) {
            prev->next = curr->next;
            curr = curr->next;

        }
        else {
            prev = curr;
            curr = curr->next;
        }
    }
    return head;
}
