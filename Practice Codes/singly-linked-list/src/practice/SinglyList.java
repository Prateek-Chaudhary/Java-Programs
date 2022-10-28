package practice;

public class SinglyList {
	private Node2 head = null;
	
	public void add(int d) {
		Node2 fresh = new Node2(d);
		if(head == null) {
			head = fresh;
			return;
		}
		Node2 current = head;
		while(current.next != null)
			current = current.next;
		current.next = fresh;
	}
	
	private StringBuilder show() {
		Node2 current = head;
		StringBuilder s = new StringBuilder();
		while(current != null) {
			s.append(current.data);
			current = current.next;
		}
		s.reverse();
		return s;
	}
	
	public int addLists(SinglyList l1, SinglyList l2) {
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder();
		s1 = l1.show();
		s2 = l2.show();
		int n = Integer.parseInt((String.valueOf(s1))) + Integer.parseInt((String.valueOf(s2)));
		int ref = n;
		StringBuilder s3 = new StringBuilder();
		while(ref > 0) {
			int m = ref%10;
			s3.append(m);
			ref /= 10;
		}
		n = Integer.parseInt((String.valueOf(s3)));
		return n;
	}
	
	public void showAll() {
		Node2 current = head;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
}
