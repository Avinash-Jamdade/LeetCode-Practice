class MyStack {
    Queue<Integer> queue = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        for(int i = 1; i<queue.size(); ++i) {
            queue.add(queue.remove());
        }
        return queue.remove();
    }
    
    public int top() {
        for(int i = 1; i<queue.size(); ++i) {
            queue.add(queue.remove());
        }
        int x = queue.remove();
        queue.add(x);
        return x;
    }
    
    public boolean empty() {
        if(queue.size() > 0) return false;
        return true;
    }
}
