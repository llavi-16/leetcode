class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        ListNode pointer = head;
        while(pointer != null && pointer.next != null){
            if(pointer.next.val == val){
                pointer.next = pointer.next.next;

            }else{
                pointer = pointer.next;
            }
        }
        return head;
        
    }
}