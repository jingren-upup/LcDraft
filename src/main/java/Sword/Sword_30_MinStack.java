package Sword;

import java.util.Stack;

public class Sword_30_MinStack {
    /** initialize your data structure here. */
    Stack<Integer>A,B;
    public Sword_30_MinStack() {
        A = new Stack<Integer>();
        B = new Stack<Integer>();
    }

    public void push(int x) {
        A.add(x);
        //一定要包含最小值
        if (B.isEmpty()||B.peek()>=x){
            B.add(x);
        }

    }

    public void pop() {
        if (A.peek().equals(B.peek())){
            B.pop();
        }
        A.pop();

    }

    public int top() {
        return A.peek();

    }

    public int min() {
        return B.peek();
    }

}
