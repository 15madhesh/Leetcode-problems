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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb1 = new StringBuilder();
        while(l1 != null){
            sb1.append(l1.val);
            l1 = l1.next;
        }
        StringBuilder sb2 = new StringBuilder();
        while(l2 != null){
            sb2.append(l2.val);
            l2 = l2.next;
        }
        int i = sb1.length() - 1;
        int j = sb2.length() - 1;
        int carry = 0,sum;
        StringBuilder res = new StringBuilder();
        while(i >= 0 || j >= 0 || carry > 0){
            sum = carry;
            if(i >= 0){
                sum += sb1.charAt(i--) - '0';
            }
            if(j >= 0){
                sum += sb2.charAt(j--) - '0';
            }
            res.append(sum % 10);
            carry = sum / 10;
        }
        String result = res.reverse().toString();
        ListNode head = new ListNode();
        ListNode temp = head;
        int k = 0;
        while(k < result.length()){
            ListNode newval = new ListNode(result.charAt(k) - '0');
            temp.next= newval;
            temp = temp.next;
            k++;
        }
        return head.next;
    }
}