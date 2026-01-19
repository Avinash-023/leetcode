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
        ListNode dummy=new ListNode(0);
        dummy.next=list1;

        ListNode temp1=dummy;
        for(int i=0;i<a;i++){
            temp1=temp1.next;
        }
        ListNode temp2=temp1;
        for(int i=a;i<=b;i++){
            temp2=temp2.next;
        }
        temp2=temp2.next;
        temp1.next=list2;

        ListNode tail=list2;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=temp2;
        return dummy.next;
    }
}
