package com.assignment1;

public class ToDoList {
	 private Node head;
	 private int size;
	 public ToDoList() {
		 this.head = null;
	     this.size = 0;
	    }
	 // addToDo: Add a new task to the end of the linked list
	 public void addToDo(String title, String description) {
		 Task newTask = new Task(title, description);
	     Node newNode = new Node(newTask);
         if (this.head == null) {
        	 this.head = newNode;
	        } 
         else {
	            Node current = head;
	            while (current.getNext() != null) {
	            	current = current.getNext();
	            }
	            current.setNext(newNode);
	        }
	        this.size++;
	    }
	 // markToDoAsCompleted: Mark a task as completed based on its title
	 public void markToDoAsCompleted(String title) {
		 Node current = this.head;
	     while (current != null) {
	    	 if (current.getTask().getTitle().equals(title)) {
	                current.getTask().markAsCompleted();
	                return;
	            }
	            current = current.getNext();
	        }
	        System.out.println("Task not found: " + title);
	    }
	 // viewToDoList: Display the list of tasks in the to-do list
	 public void viewToDoList() {
		 Node current = this.head;
		 if (current == null) {
			 System.out.println("ToDo List is empty.");
	         return;
	        }
	     System.out.println("To-Do List:");
	      while (current != null) {
	            Task task = current.getTask();
	            System.out.println("- " + task.getTitle() + " (" + (task.isCompleted() ? "Completed" : "Incomplete") + ")");
	            current = current.getNext();
	        }
	    }

	    // deleteToDo: Remove a task from the to-do list based on its title
	    public void deleteToDo(String title) {
	        if (this.head == null) {
	            System.out.println("To-Do list is empty.");
	            return;
	        }
	        if (this.head.getTask().getTitle().equals(title)) {
	        	this.head = this.head.getNext();
	            this.size--;
	            return;
	        }
	        Node current = this.head;
	        while (current.getNext() != null) {
	            if (current.getNext().getTask().getTitle().equals(title)) {
	                current.setNext(current.getNext().getNext());
	                this.size--;
	                return;
	            }
	            current = current.getNext();
	        }

	        System.out.println("Task not found: " + title);
	    }

	    // searchToDo: Find a task in the to-do list based on its title
	    public Task searchToDo(String title) {
	        Node current = this.head;
	        while (current != null) {
	            if (current.getTask().getTitle().equals(title)) {
	                return current.getTask();
	            }
	            current = current.getNext();
	        }
	        return null;
	    }

}
