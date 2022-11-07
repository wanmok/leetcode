/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* l1_cursor     = l1;
        ListNode* l2_cursor     = l2;
        ListNode* result        = NULL;
        ListNode* result_cursor = NULL;
        bool increment          = false;
        
        while (l1_cursor != NULL or l2_cursor != NULL or increment) {
            int sum(0);
            
            if (increment){
                sum         = sum + 1;
                increment   = false;
            }
            
            if (l1_cursor != NULL){
                sum         = sum + l1_cursor->val;
                l1_cursor   = l1_cursor->next;
            }
            if (l2_cursor != NULL){
                sum         = sum + l2_cursor->val;
                l2_cursor   = l2_cursor->next;
            }
            
            if (sum >= 10){
                sum         = sum % 10;
                increment   = true;
            }
            
            ListNode* new_node  = new ListNode(sum);
            if (!result){
                result          = new_node;
                result_cursor   = result;
            }
            else{
                result_cursor->next = new_node;
                result_cursor       = result_cursor->next;
            }
        }
        
        return (result);
    }
};