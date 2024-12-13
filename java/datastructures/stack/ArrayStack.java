package org.example.stacks;

public class ArrayStack {
    protected int capacity;
    public static final int CAPACITY = 10;
    protected int[] stackRep;
    protected int top = -1;
    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int cap) {
        capacity = cap;
        stackRep = new int[capacity];
    }

    public int size() {
        return top+1;
    }

    public boolean isEmpty() {
        return top<0;
    }

    public void push(int data) throws Exception {
        if(size()==capacity) {
            throw new Exception("Stack is full");
        }
        stackRep[top++] = data;
    }
    public int top() throws Exception {
        if(isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return stackRep[top];
    }

    public int pop() throws Exception {
        int data;
        if(isEmpty()) {
            throw new Exception("Stack is empty");
        }
        data = stackRep[top];
        stackRep[top--] = Integer.MIN_VALUE;
        return data;
    }

    public String toString() {
        String s;
        s = "[";
        if(size()>0) {
            for(int i =0 ; i<=size()-1; i++) {
                s+= "," + stackRep[i];
            }
        }
        return s + "]";
    }
}
