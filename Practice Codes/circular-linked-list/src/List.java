public class List {
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.addStart(6);
		list.addStart(7);
		list.addStart(8);
		list.addInBetween(9, 3);
		list.deleteLast();
		list.deleteFirst();
		list.showAll();
	}
}
