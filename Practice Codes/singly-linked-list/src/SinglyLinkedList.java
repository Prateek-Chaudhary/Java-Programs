public class SinglyLinkedList {

	private Node head = null;

	// adding the element in the linked list
	
	public void add(int d) {
		Node fresh = new Node(d);
		if (head == null) {
			head = fresh;
			return;
		}
		Node current = head;
		while (current.next != null)
			current = current.next;
		current.next = fresh;
	}
	
	// adding element at the start of the linked list

	public void addFirst(int d) {
		Node first = new Node(d);
		first.next = head;
		head = first;
	}
	
	// adding element in between the linked list

	public void addInBetween(int d, int index) {
		Node btwn = new Node(d);
		Node current = head;
		for (int i = 0; i < index - 1; i++) {
			current = current.next;
		}
		btwn.next = current.next;
		current.next = btwn;
	}
	
	// adding element at the last of the linked list

	public void addLast(int d) {
		add(d);
	}
	
	// Searching in the linked list
	
	public void search(int d) {
		Node current = head;
		int count = 1;
		while(current != null) {
			if(current.data == d)
				System.out.println("Data : "+d+" is at location : "+count);
			++count;
			current = current.next;
		}
	}
	
	// deleting the element from the start position of the linked list
	
	public void deleteStart() {
		head = head.next;
	}
	
	// deleting the element from the end of the linked list
	
	public void deleteEnd() {
		Node current = head;
		while(current.next.next != null) {
			current = current.next;
		}
		current.next = null;
	}
	
	// deleting the element from the given index
	
	public void delete(int index) {
		Node current = head;
		for(int i = 0; i < index-2; i++) {
			current = current.next;
		}
		current.next = current.next.next;
	}

	public void showAll() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}
