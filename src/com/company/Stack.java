package com.company;

public interface Stack<T> {
    
    public boolean isEmpty();
    
    public void pop() throws StackUnderflowException;
    
    public void push(T item);
    
    public T top() throws StackUnderflowException;

    public T getLoc(int i);

    @Override
    public String toString();
}