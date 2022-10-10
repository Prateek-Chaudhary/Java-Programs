public class List {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.addFirst(5);
		list.addInBetween(7, 1);
		list.addLast(10);
		list.showAll();
//		list.search(3);
//		list.deleteStart();
//		list.showAll();
//		list.deleteEnd();
//		list.showAll();
		list.delete(3);
		list.showAll();
	}
}
