package reverse;

public class ReverseList {
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.showAll();
		list.reverse();
	}
}
