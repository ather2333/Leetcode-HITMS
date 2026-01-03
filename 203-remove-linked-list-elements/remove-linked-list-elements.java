class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null; // base case

        // Recursively remove elements from the rest of the list
        head.next = removeElements(head.next, val);

        // Decide whether to keep the current node
        return head.val == val ? head.next : head;
    }
}
