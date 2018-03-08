import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2018/1/19.
 */
public class MyStack {
    private Queue<Integer> queue;
    public MyStack() {
        this.queue = new LinkedList();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        for(int i=0;i<queue.size()-1;i++)
        {
            queue.add(queue.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return  queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
    public static void main(String[] args){

         MyStack obj = new MyStack();
         obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.push(7);

         int param_3 = obj.top();
         int param_2 = obj.pop();
         boolean param_4 = obj.empty();
         System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}
