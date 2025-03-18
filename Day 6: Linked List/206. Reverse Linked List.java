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
    public ListNode reverseList(ListNode head) {
        if(head == null)
        return head;
        ListNode currNode = head, prevNode = null, nextNode = null;
        while(currNode != null)
        {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }
}
// TC : O(N)
// SC : O(1)

// Recursive Approach 
class Solution {
    public ListNode reverseLL(ListNode currNode){
        if(currNode.next == null){
            return currNode;
        }
        ListNode newHead = reverseLL(currNode.next);
        ListNode nextNode = currNode.next;
        nextNode.next = currNode;
        currNode.next = null;
        return newHead;
    }
    public ListNode reverseList(ListNode head) {
        if(head == null)
        return head;
        ListNode newHead = reverseLL(head);
        return newHead;
    }
}
// TC : O(N)
// SC : O(N)[Recursive Stack Space]
