package leetcode24;

public class SwapNodeFromLinkedLIstFunction {
	// Iteration solution 
    public ListNode swapPairs(ListNode head) {
    	// As a pointer to know where to start
        ListNode dummy = new ListNode(0);
        
        dummy.next = head;
        
        ListNode current = dummy;
        
        // While firstNode and secondNode is not null
        while(current.next != null && current.next.next != null){
            ListNode firstNode = current.next; 
            ListNode secondNode = current.next.next;
            
            // How to swap pointers
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            
            // Update them
            current.next = secondNode;
            
            // Don't need this line of code, since secondNode.next already point to firstNode
            current.next.next = firstNode;
            
            current = current.next.next;
            
        }
        
        return dummy.next;
    }
    
    // Recursive way
    public ListNode swapPairs2(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode n = head.next;
        
        head.next = swapPairs(head.next.next);
        
        n.next = head;
        
        return n;
    }
}
