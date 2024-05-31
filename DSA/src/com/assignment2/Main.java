package com.assignment2;

public class Main {

	public static void main(String[] args) {
		// Create a new linked list
        SinglyLinkedList list = new SinglyLinkedList();
        // Insert some nodes
        list.insertAtPos(18, 1); // Insert 18 at position 1
        list.insertAtPos(28, 2); // Insert 28 at position 2
        list.insertAtPos(34, 3); // Insert 34 at position 3
        list.insertAtPos(30, 4); // Insert 30 at position 4
        int size=list.size();
        System.out.println(size);
        // Display the linked list
        System.out.println("Linked List after insertion at given position:");
        list.displayList(list);
        // Delete a node at position 2
        list.deleteAtPosition(2);
        // Display the linked list after deletion
        System.out.println("\nLinked List after deletion at position 2:");
        list.displayList(list);
        // Search for a node with data 30
        int valueToSearch = 30;
        boolean found = list.searchNode(valueToSearch);
        System.out.println(found);
        
       
	}

   
    
}