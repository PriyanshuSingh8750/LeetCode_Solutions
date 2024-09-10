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
    private int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode p1=head;
        ListNode p2=head.next;
        while(p2!=null){
            int currentGCD=gcd(p1.val,p2.val);
            ListNode G = new ListNode(currentGCD);
            p1.next=G;
            G.next=p2;
            p1=p2;
            p2=p2.next;
        }
        return head;
    }
}
