package org.example.stacks;

import java.util.EmptyStackException;

public class LinkedListStack<T> {
    private int length;
    private ListNode top;

    public LinkedListStack() {
        length = 0;
        top = null;
    }

    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.setNext(top);
        top = temp;
        length++;
    }

    public int pop() throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        int result = top.getdata();
        top = top.getNext();
        length--;
        return result;
    }

    public int peek() throws EmptyStackException {
        if(isEmpty()) throw new EmptyStackException();
        return top.getdata();
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int size() {
        return length;
    }

    public String toString() {
        String result = "";
        ListNode current = top;
        while(current!=null) {
            result = result + current.toString() + "/n";
            current = current.getNext();
        }
        return result;
    }
}