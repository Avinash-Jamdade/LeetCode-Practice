
class Solution {
    public ListNode middleNode(ListNode head){
        ListNode s=head;
        ListNode f=head;
        while(f != null && f.next !=null){
            s=s.next;
            f=f.next.next;

        }
        return s;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr = head;
        ListNode tail = head;
        ListNode next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
     return head=prev;  
    }
     public boolean  isPalindrome(ListNode head){
        ListNode mid=middleNode(head);
        ListNode headSecond=reverseList(mid);
        ListNode reverseHead=headSecond;

        while (head != null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }
            head=head.next;
            headSecond=headSecond.next;
        }
        reverseList(reverseHead);
        return head==null || headSecond == null;
    }
}
