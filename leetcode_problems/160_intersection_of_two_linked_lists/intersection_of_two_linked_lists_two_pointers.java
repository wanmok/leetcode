/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // This is an O(m+n) solution
    // It aligns the lists to their right sides
    // Thus, in the same iteration step, they can exam nodes equally
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        int numA = 0, numB = 0;
        while (pA != null) {
            numA ++;
            pA = pA.next;
        }
        while (pB != null) {
            numB ++;
            pB = pB.next;
        }
        
        if (numA < numB) {
            ListNode tempNode = headA;
            headA = headB;
            headB = tempNode;
            
            int tempNum = numA;
            numA = numB;
            numB = tempNum;
        }
        
        pA = headA;
        pB = headB;
        
        for (int i = 1; i <= numA - numB; i ++) 
            pA = pA.next;
        
        for (int i = 1; i <= numB; i ++) {
            if (pA == pB)
                return pA;
            pA = pA.next;
            pB = pB.next;
        }
        
        return null;
    }
}