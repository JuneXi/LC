package company.google;

import java.util.Stack;

/*Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.*/
//TODO:
public class MinStack {
	long min;
	Stack<Long> stack;
	 /** initialize your data structure here. */
    public MinStack() {
    	stack = new Stack<>();
        
    }
    
    public void push(int x) {
    	if(stack.isEmpty()){
    		stack.push(0L);
    		min = x;
    	}else{
    		stack.push(x - min);
    		if(x < min){
    			min = x;
    		}
    	}
    }
    
    public void pop() {
    	if(stack.isEmpty()){
    		return;
    	}
    	
    	long pop = stack.pop();
    	if(pop < 0){
    		min = min - pop;
    	}
        
    }
    
    public int top() {
    	long top = stack.peek();
    	if(top > 0){
    		return (int) (top + min);
    	}else{
    		return (int)min;
    	}
        
    }
    
    public int getMin() {
        return (int) min;
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
