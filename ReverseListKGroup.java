class ReverseListKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode prev=null;
        int nodeCount=0;
        while(current!=null && nodeCount<k){
            nodeCount++;
            current = current.next;
        }
        if(nodeCount<k){
            return head;
        }
        current = head;
        int currentNode=1;
        while(current!=null  && currentNode<=k){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
            currentNode++;
           
        }
        head.next = reverseKGroup(current,k);
        head = prev;
        return head;
        
    }
}
