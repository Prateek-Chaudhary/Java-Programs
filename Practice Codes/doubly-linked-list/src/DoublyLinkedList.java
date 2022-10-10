public class DoublyLinkedList {
	private Node head = null;
	private Node tail = null;
	
	// adding the element in the doubly linked list
	
	public void add(int d) {
		Node fresh = new Node(d);
		if(head == null) {
			head = fresh;
			head.next = null;
			head.prev = null;
			return;
		}
		tail = head;
		while(tail.next != null) {
			tail = tail.next;
		}
		tail.next = fresh;
		fresh.prev = tail;
		fresh.next = null;
		tail = fresh;
	}
	
	// adding the element at the beginning of the doubly linked list
	
	public void addStart(int d) {
		Node fresh = new Node(d);
		fresh.next = head;
		fresh.prev = null;
		head.prev = fresh;
		head = fresh;
	}
	
	// adding the element at the last in the doubly linked list
	
	public void addLast(int d) {
		add(d);
	}
	
	// adding the element in between the doubly linked list
	
	public void addInBetween(int d, int index) {
		Node fresh = new Node(d);
		Node current = head;
		for(int i = 0; i < index - 2; i++)
			current = current.next;
		fresh.next = current.next;
		fresh.prev = current;
		current.next.prev = fresh;
		current.next = fresh;
	}
	
	// searching element from the doubly linked list
	
	public void search(int d) {
		int count = 1;
		Node current = head;
		while(current != null) {
			if(current.data == d) {
				System.out.println("Element "+d+" is at location "+count);
				break;
			}
			current = current.next;
			count++;
		}
	}
	
	// delete element from the last of the doubly linked list
	
	public void deleteLast() {
		tail = tail.prev;
		tail.next = null;
	}
	
	// delete from the starting of the doubly linked list
	
	public void deleteStart() {
		head = head.next;
		head.prev = null;
	}
	
	// delete the given element from the doubly linked list
	
	public void delete(int d) {
		Node current = head;
		while(current != null) {
			if(current.data == d) {
				current.prev.next = current.next;
				current.next.prev = current.prev;
				break;
			}
			current = current.next;
		}
	}
	
	// showing the elements of doubly linked list
	
	public void showAll() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	
	// showing the elements of the doubly linked list in the reverse order
	
	public void showReverse() {
		Node current = tail;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.prev;
		}
		System.out.println();
	}
}
