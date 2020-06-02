class MinStack {

   ListNode head;
    
    public MinStack() {
        head = null;
    }
    
    public void push(int x) {
         ListNode temp = new ListNode(x);
        if(head == null) {
             head = temp; 
        }  else {
            temp.next = head;
        }
        temp.min = Math.min(temp.min, head.min);
        head = temp;
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.value;
    }
    
    public int getMin() {
        return head.min;
    }
   
}