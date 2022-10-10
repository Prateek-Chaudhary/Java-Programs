import java.util.LinkedHashSet;

public class LinkedHashSetClass {
	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(3);
		System.out.println(set);
	}
}
