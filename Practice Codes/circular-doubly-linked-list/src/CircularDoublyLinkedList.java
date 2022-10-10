public class CircularDoublyLinkedList {
	private Node head = null;
	private Node tail = null;
	
	// adding the element in the last of the circular doubly linked list
	
	public void add(int d) {
		Node fresh = new Node(d);
		if(head == null) {
			head = fresh;
			head.next = fresh;
			head.prev = fresh;
			tail = head;
			return;
		}
		Node current = head;
		while(current.next != head) {
			current = current.next;
		}
		current.next = fresh;
		fresh.next = head;
		fresh.prev = current;
		head.prev = fresh;
		tail = fresh;
	}
	
	// adding at the beginning of the circular doubly linked list
	
	public void addFirst(int d) {
		Node fresh = new Node(d);
		fresh.next = head;
		fresh.prev = tail;
		tail.next = fresh;
		head = fresh;
	}
	
	// deleting the element from the last
	
	public void deleteLast() {
		Node current = tail;
		current.prev.next = head;
		head.prev = current.prev;
		tail = current.prev;
	}
	
	// delete from the beginning 
	
	public void deleteFirst() {
		Node current = head.next;
		current.prev = tail;
		tail.next = current;
		head = current;
	}
	
	// showing the elements of the circular doubly linked list
	
	public void showAll() {
		Node current = head;
		System.out.print(current.data+" ");
		current = current.next;
		while(current != head) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
}
