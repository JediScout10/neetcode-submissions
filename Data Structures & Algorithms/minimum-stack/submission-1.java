class MinStack {
ArrayDeque<Integer> mini;
ArrayDeque<Integer>main;
    public MinStack() {
         mini = new ArrayDeque<>();
         main = new ArrayDeque<>();
    }
    
    public void push(int val) {
        main.push(val);
        if(mini.isEmpty() || val<=mini.peek()){
            mini.push(val);
        }
    }    
    public void pop() {
        if(mini.peek().equals(main.peek())){
            mini.pop();
            
        }main.pop();
    }
    
    public int top() {
       return main.peek();
    }
    
    public int getMin() {
        return mini.peek();
    }
}
