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
// class Solution {
//      public ListNode middleNode(ListNode head) {
//         ListNode slow=head;
//         ListNode fast=head;
//         while(fast != null && fast.next !=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;
//     }
//     public boolean isPalindrome() {
//         if(head== null || head.next == null){
//             return true;
//         }
//        ListNode midNode=middleNode(head);
//        List curr=mid;
//        ListNode prev=null;
//         ListNode curr=midNode;
//         ListNode next;
//         while(curr != null){
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         ListNode right=prev;
//         ListNode left=head;
//         while(right != null){
//             if(left.val != right.val){
//                 return false;
//             }
//             left=left.next;
//             right=right.next;
//         }
//         return true;
//     }
    

// }
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head.next==null){
            return true;
        }
        
        ListNode node = checkHeadAndTail(head, head);
        return node != null;
    }
    
    public ListNode checkHeadAndTail(ListNode head, ListNode curr){
        if(curr.next==null){
            if(head.val == curr.val){
                return head.next;
            }
            else{
                return null;
            }
        }
        
        ListNode node = checkHeadAndTail(head, curr.next);
     if(node!=null && node.next==null){
            return node;
        }
         if(node == null || node.val != curr.val){
            return null;
        }
        
        return node.next;
    }
    
}