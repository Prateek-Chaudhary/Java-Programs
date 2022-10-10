public class LinkedStack {
	private MyStack top = null;
	
	public void push(char d) {
		MyStack fresh = new MyStack(d);
		fresh.next = top;
		top = fresh;
	}
	
	public char pop() {
		char c = top.data;
		top = top.next;
		return c;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public char peek() {
		if(top == null)
			return ' ';
		return top.data;
	}
}
