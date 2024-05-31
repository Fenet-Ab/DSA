package com.assignment2;

public class StackTesting {

	public static void main(String[] args) {
		Stack stack = new Stack();
        // Push elements onto the stack
        stack.push(12);
        stack.push(2);
        stack.push(3);
        int numberpeek=stack.peek();
        int size=stack.size();
        System.out.println(size);
        int pop=stack.pop();
        System.out.println("Peeked element: " + numberpeek);
        System.out.println("Popped element: " + pop);
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        // Pop elements when stack is empty
        System.out.println("Popped element: " + stack.pop());
	}

}
