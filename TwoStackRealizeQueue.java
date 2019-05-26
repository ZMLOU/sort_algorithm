package com.tech.day;

import java.util.Stack;

public class TwoStackRealizeQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack1.empty()){
            throw new RuntimeException("stack is empty");
        }
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        int temp = stack2.pop();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return temp;
    }
}