package reverse;

public class ReverseLinkedList {
	private Node head = null;
	
	public void add(int d) {
		Node fresh = new Node(d);
		if(head == null) {
			head = fresh;
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = fresh;
	}
	
	public void reverse() {
		Node prev = null;
		Node current = head;
		while(current != null) {
			Node temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		showReverse(prev);
	}
	
	private void showReverse(Node prev) {
		Node current = prev;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
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
