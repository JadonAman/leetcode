import java.util.Stack;

class MyQueue {
    private Stack<Integer> sta;
    private Stack<Integer> stb;

    public MyQueue() {
        sta = new Stack<>();
        stb = new Stack<>();
    }
    
    public void push(int x) {
        sta.push(x);
    }
    
    public int pop() {
        if (stb.isEmpty()) {
            while (!sta.isEmpty()) {
                stb.push(sta.pop());
            }
        }
        return stb.pop();
    }
    
    public int peek() {
        if (stb.isEmpty()) {
            while (!sta.isEmpty()) {
                stb.push(sta.pop());
            }
        }
        return stb.peek();
    }
    
    public boolean empty() {
        return sta.isEmpty() && stb.isEmpty();
    }
}


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */