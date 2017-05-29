//Given single linked list, group all odd nodes together followed by the evens

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode copy=head;//exact copy
        
        ListNode a= new ListNode(0);
        ListNode b= new ListNode(0);
       
        ListNode even=a;
        ListNode odd=b;
        
        if(copy==null)
        {
            return null;
        }
        
        while (copy!=null)
        {
            if(copy.val%2==0)
            {
                even.next=new ListNode(copy.val);
                
                even=even.next;
                
            }
            else
            {
                odd.next= new ListNode(copy.val);
                odd=odd.next;
            }
            copy=copy.next;
        }
        odd.next=a.next; //7->2,4,6,8
        
        return b.next;
    }
}