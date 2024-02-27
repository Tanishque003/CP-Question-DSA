class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        k -= 1;
        while(k--> 0) fast = fast.next;
        ListNode node = fast;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        int temp = slow.val;
        slow.val= node.val;
        node.val = temp;
        return head;
    }
}