package hw2.num1;
import java.util.Stack;

class Queue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
 
    public void enqueue(Integer num) {
        stack1.push(num);
    }
 
    public int dequeue() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            while(stack1.size() > 0) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }
    
    public int size() {
        return stack1.size() + stack2.size();
    }
}

public class TwoStackToQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        
        while(q.size() > 0) {
            System.out.print(q.dequeue() + " ");
        }
    }

}
