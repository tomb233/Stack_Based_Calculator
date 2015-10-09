package com.company;

public interface Stack<T> {
    
    public boolean isEmpty();
    
    public void pop() throws StackUnderflowException;
    
    public void push(T item);
    
    public T top() throws StackUnderflowException;
    
    @Override
    public String toString();
}
