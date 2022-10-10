public class CircularLinkedList {
	private Node head = null;
	
	// adding the element in the circular linked list
	
	public void add(int d) {
		Node fresh = new Node(d);
		if(head == null) {
			head = fresh;
			fresh.next = head;
			return;
		}
		Node current = head;
		while(current.next != head) {
			current = current.next;
		}
		current.next = fresh;
		fresh.next = head;
	}
	
	// adding element in the beginning of the circular linked list
	
	public void addStart(int d) {
		Node fresh = new Node(d);
		fresh.next = head;
		Node current = head;
		while(current.next != head) {
			current = current.next;
		}
		current.next = fresh;
		head = fresh;
	}
	
	// adding element at any point of the circular linked list
	
	public void addInBetween(int d, int index) {
		Node fresh = new Node(d);
		Node current = head;
		for(int i = 0; i < index-2; i++) {
			current = current.next;
		}
		fresh.next = current.next;
		current.next = fresh;
	}
	
	// searching the element in the circular linked list
	
	public void search(int d) {
		Node current = head;
		int count = 0;
		boolean flag = false;
		while(current.next != head) {
			if(current.data == d) {
				System.out.println("Element "+d+" is at position : "+(count+1));
				flag = true;
				break;
			}
			count++;
			current = current.next;
		}
		if(!flag)
			System.out.println("Element "+d+" not found in the list");
	}
	
	// deleting the element form the last of the circular linked list
	
	public void deleteLast() {
		Node current = head;
		while(current.next.next != head) {
			current = current.next;
		}
		current.next = head;
	}
	
	// deleting the element from the beginning of the circular linked list
	
	public void deleteFirst() {
		Node current = head;
		while(current.next != head) {
			current = current.next;
		}
		head = head.next;
		current.next = head;
	}
	
	// showing the circular linked list
	
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
