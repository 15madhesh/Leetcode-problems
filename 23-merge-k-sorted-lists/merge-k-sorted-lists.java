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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> lt = new ArrayList<>();
        for(ListNode ln : lists){
            while(ln!=null){
                lt.add(ln.val);
                ln = ln.next;
            }
        }
        if(lt.size() == 0){
            return null;
        }
        Collections.sort(lt);
        ListNode head = new ListNode();
        ListNode temp = head;
        for(int a : lt){
            ListNode val = new ListNode(a);
            temp.next = val;
            temp = temp.next;
        }
        return head.next;
    }
}