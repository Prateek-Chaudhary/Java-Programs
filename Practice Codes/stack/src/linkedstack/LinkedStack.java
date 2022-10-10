package linkedstack;

public class LinkedStack {
	private Node head = null;
	
	public void push(int d) {
		Node fresh = new Node(d);
		fresh.next = head;
		head = fresh;
	}
	
	public void pop() {
		head = head.next;
	}
	
	public boolean isEmpty() {
		if(head == null)
			return true;
		return false;
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(1);
		}
		System.out.println(head.data);
	}
	
	public void showAll() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
}
