public class LinkedStack2 {
	private MyStack2<String> top = null;
	
	public void push(String d) {
		MyStack2<String> fresh = new MyStack2<String>(d);
		fresh.next = top;
		top = fresh;
	}
	
	public String pop() {
		String c = top.data;
		top = top.next;
		return c;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public String peek() {
		if(top == null)
			return " ";
		return top.data;
	}
}
