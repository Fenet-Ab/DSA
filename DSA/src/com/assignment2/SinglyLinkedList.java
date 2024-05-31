package com.assignment2;


public class SinglyLinkedList {
	 private Node head;
	 public SinglyLinkedList() {
		 this.head = null;
	    }
	 //the method insert data at a position we need
	 public void insertAtPos(int data, int position) {
		 Node newNode = new Node(data); // create new Node at the given data
	     if (position == 1) {    // Check if the position is the first node
			 newNode.next = head;
	         head = newNode;
	        }
		 else {
			 Node current = head;
	         // If the position is not 1, traverse the list to find the node at position - 1
	         for (int i = 1; i < position - 1 && current != null; i++) {
	        	 current = current.next;
	            }
	         if (current == null) {
	        	 System.out.println("Invalid position");
	            }
	         // Otherwise, insert the new node between current and its next node
	         else {
	        	 newNode.next = current.next;
	             current.next = newNode;
	            }
	        }
	    }
	 // Method to delete a node at a specified position
	 public void deleteAtPosition(int position) {
		 if (position == 1) {
			 head = head.next;
	        } 
		 else {
			 Node current = head;
	         Node previous = null;
	         for (int i = 1; i < position && current != null; i++) {
	        	 previous = current;
	             current = current.next;
	            }
	         if (current == null) {
	        	 System.out.println("Invalid position");
	            } 
	         else {
	        	 previous.next = current.next;
	            }
	        }
	    }
	 // Method to delete the node after a given node takes Node argument the argument is the node form which we want to delete after  
	 public void deleteAfterNode(Node node) {
		 // Check if the given node and its next node are not null
		 if (node != null && node.next != null) {
			 // If both the given node and its next node are not null,
	         // set the next reference of the given node to skip the next node
	          // effectively removing the next node from the linked list
	            node.next = node.next.next;
	        }
	    }
	 // Method to search for a node with a specific value
	 public boolean searchNode(int value) {
		 // Start the search from the head of the linked list
	      Node current = head;
	      // Iterate through the linked list until the end is reached (current becomes null)
	       while (current != null) {
	        	if (current.data == value) {  // Check if the data of the current node matches the target value
	            	 return true;    // If a node is found, return true
	            }
	        	// Move to the next node in the linked list
	             current = current.next;
	        }
	       // If the end of the linked list is reached without finding the target value, return false
	        return false;
	    }
	 public int size() {
	        int count = 0; // Initialize count to 0
	        Node current = head; 
	        while (current != null) {
	        	count++; 
	            current = current.next; 
	        }
	        return count; 
	    }
       // method display lists
	    static void displayList(SinglyLinkedList list) {
	        Node current = list.head;
	        while (current != null) {
	            System.out.println(current.data );
	            current = current.next;
	        }
	        System.out.println("null");  // the last node next is null it indicate that
	    }
	

}
