package com.assignment1;

public class Main {

	public static void main(String[] args) {
		ToDoList toDoList = new ToDoList();
		toDoList.addToDo("Finish assignment", "Complete the homework by the end of the week");
	    toDoList.addToDo("Go grocery shopping", "Buy milk, eggs, and bread");
	    toDoList.addToDo("Call mom", "Catch up with mom this weekend");
        toDoList.viewToDoList();
        toDoList.markToDoAsCompleted("Finish assignment");
        System.out.println("\nAfter marking 'Finish assignment' as completed:");
	    toDoList.viewToDoList();
        toDoList.deleteToDo("Go grocery shopping");
        System.out.println("\nAfter deleting 'Go grocery shopping':");
	    toDoList.viewToDoList();
        Task foundTask = toDoList.searchToDo("Call mom");
	    if (foundTask != null) {
	    	System.out.println("\nFound task: " + foundTask.getTitle() + " - " + foundTask.getDescription());
	        } 
	    else {
	    	System.out.println("\nTask not found.");
	        }

	}

}
