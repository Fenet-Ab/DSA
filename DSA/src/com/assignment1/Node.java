package com.assignment1;

public class Node {
	private Task task;
    private Node next;
    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
    public Task getTask() {
        return this.task;
    }
    public Node getNext() {
        return this.next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

}
