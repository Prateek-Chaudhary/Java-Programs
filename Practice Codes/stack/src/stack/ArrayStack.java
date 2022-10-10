package stack;

public class ArrayStack {
	private MyStack stack = new MyStack(10);
	
	public void push(int d) {
		if(isFull()) {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
		stack.data[++stack.top] = d;
	}
	
	public boolean isFull() {
		if(stack.top == stack.capacity-1)
			return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(stack.top == -1)
			return true;
		return false;
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(1);
		}
		stack.top = stack.top -1;
		System.out.println("Successfully popped");
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			System.exit(1);
		}
		System.out.println(stack.data[stack.top]);
	}
	
	public void showAll() {
		for(int i = stack.top; i >=0; i--) {
			System.out.println(stack.data[i]);
		}
	}
}
