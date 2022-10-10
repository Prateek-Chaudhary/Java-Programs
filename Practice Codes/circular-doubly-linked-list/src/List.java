public class List {
	public static void main(String[] args) {
		CircularDoublyLinkedList list = new CircularDoublyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.addFirst(6);
		list.deleteLast();
		list.deleteFirst();
		list.showAll();
	}
}
