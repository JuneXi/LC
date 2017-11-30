package arrays;

import java.util.Stack;

public class AsteroidCollision {
	public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        //note: here
         asteroids:
        for (int ast: asteroids) {
        	while (!stack.isEmpty() && ast < 0 && 0 < stack.peek())
                if (-ast < stack.peek() || -ast == stack.pop())
                	continue asteroids;
        	stack.push(ast);
        }
        
        int[] res = new int[stack.size()];
        int i = res.length - 1;
        while(!stack.isEmpty()){
            res[i--] = stack.pop();
        }
        return res;
        
    }

}
