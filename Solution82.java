class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr != null){
            boolean dup = false;
            while(curr.next != null && curr.val == curr.next.val){
                dup = true;
                curr = curr.next;
            }
            if(dup){
                prev.next = curr.next;
            }else{
                prev = prev.next;
            }
            curr = curr.next;

        }
        return dummy.next;
    }
}