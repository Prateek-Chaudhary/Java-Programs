package linkedstack;

public class App {
	public static void main(String[] args) {
		LinkedStack stack = new LinkedStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.showAll();
		stack.pop();
		stack.showAll();
		stack.peek();
	}
}
