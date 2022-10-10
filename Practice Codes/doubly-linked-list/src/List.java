public class List {
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.addStart(6);
		list.addInBetween(9, 3);
		list.showAll();
		System.out.println("In reverse :");
		list.showReverse();
		list.search(4);
		list.deleteStart();
		list.deleteLast();
		list.delete(2);
		list.showAll();
		list.showReverse();
	}
}
