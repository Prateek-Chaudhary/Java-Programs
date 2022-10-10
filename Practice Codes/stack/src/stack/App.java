package stack;

public class App {
	public static void main(String[] args) {
		ArrayStack as = new ArrayStack();
		System.out.println(as.isEmpty());
		as.push(1);
		as.push(2);
		as.push(3);
		as.push(4);
		as.push(5);
		as.push(6);
		as.push(7);
		as.push(8);
		as.push(9);
		as.push(10);
		System.out.println(as.isEmpty());
		as.pop();
		as.showAll();
		as.peek();
	}
}
