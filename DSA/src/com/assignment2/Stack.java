package com.assignment2;

public class Stack {
	private Node top;
	private int size;
    public Stack() {
    	this.top = null;
    	this.size=0;
    }
 // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
 // Method to check if the stack is full (always returns false for linked list-based stacks)
    public boolean isFull() {
        return false;
    }

// Method to push a new element onto the stack 
    public void push(int data) {
    	Node newNode = new Node(data);
    	if (isEmpty()) { 
            top = newNode;
        } 
    	else {
            newNode.next = top;
            top = newNode;
        }
    	size++;
        System.out.println(data + " pushed to the stack.");
    }
    // Method to pop the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty please.");
            return  -1; // if the stack is empty it return -1.
        } 
        else {
            int poppedData = top.data;
            top = top.next;
            size--;
            return poppedData;
        }
    }
 // Method to peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty please");
            return  -1;  //if the stack is empty it return -1.
        } 
        else {
            return top.data;
        }
    }
    public int size() {
        return size;
    }
    

}
