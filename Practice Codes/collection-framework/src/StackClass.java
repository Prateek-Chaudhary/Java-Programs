import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
		Stack<Integer> list = new Stack<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		list.push(6);
		System.out.println(list);
		list.pop();
		System.out.println(list);
		System.out.println(list.peek());
	}
}
