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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode Start=head;
        if(Start ==null || Start.next==null){
            return head;
        }
        while(Start.next != null){
            if(Start.val== Start.next.val){
                Start.next=Start.next.next;
            }
            else{
                Start=Start.next;
            }
        }
        return head;
    }
}