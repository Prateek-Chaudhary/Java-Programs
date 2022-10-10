package stack;

public class MyStack {
	int data[];
	int capacity;
	int top;
	
	public MyStack(int capacity) {
		this.capacity = capacity;
		data = new int[capacity];
		top = -1;
	}
}
