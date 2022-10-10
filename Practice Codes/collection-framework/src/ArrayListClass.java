import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.isEmpty());
		System.out.println(list.contains(8));
		ArrayList<Integer> l = (ArrayList<Integer>)list.clone();
		System.out.println(l);
	}
}
