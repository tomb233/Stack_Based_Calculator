package com.company;

public class LinkedStack<T> implements Stack<T> {
    private ListNode<T> top;
    
    public LinkedStack() {
        top = null;
    }
    
    @Override
    public boolean isEmpty() {
        return top == null;
    }
    
    @Override
    public T top() {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        return top.getItem();
    }
    
    @Override
    public void pop() {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        top = top.getNext();
    }
    
    @Override
    public void push(T item) {
        top = new ListNode<>(item, top);
    }
    
    @Override
    public String toString() {
        String result = "LinkedStack contents = ";
        for (ListNode<T> node = top; node != null; node = node.getNext()) {
            if (node != top) {
                result += ", ";
            }
            result += node.getItem();
        }
        if(isEmpty()){
            result += "Empty!";
        }
        return result;
    }
    @Override
    public T getLoc(int i){
        ListNode<T> node = top;
        T result = null;

        for(int s=0;s<i;s++){
            node = node.getNext();
            result = node.getItem();

        }
        return result;

    }


    private int size() {
        ListNode<T> node = top;
        int result = 0;
        while (node != null) {
            result = result + 1;
            node = node.getNext();
        }
        return result;
    }
}
