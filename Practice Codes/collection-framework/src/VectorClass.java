import java.util.ArrayList;
import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) {
		Vector<Integer> list = new Vector<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		list.addAll(list1);
		System.out.println(list);
	}
}
