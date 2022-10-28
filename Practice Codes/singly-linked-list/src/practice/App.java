package practice;

public class App {
	public static void main(String[] args) {
		SinglyList list = new SinglyList();
		SinglyList list2 = new SinglyList();
		list.add(2);
		list.add(4);
		list.add(3);
		list2.add(5);
		list2.add(6);
		list2.add(4);
//		list.showAll();
//		list2.showAll();
		int res = list.addLists(list, list2);
		System.out.println(res);
	}
}
