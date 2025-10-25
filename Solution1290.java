class Solution1290 {
    public int getDecimalValue(ListNode head) {
        ListNode pointer = head;
        int sum = 0;
        while(pointer != null){
            sum = sum * 2 +pointer.val; 
            pointer = pointer.next;
        }
        return sum;
        
    }
}