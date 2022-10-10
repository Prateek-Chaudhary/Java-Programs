public class CallByValue {

	int data = 10;
	
	public int change() {
		this.data += 500;
		return this.data;
	}
	
	public static void main(String[] args) {
		CallByValue cv = new CallByValue();
		System.out.println(cv.change());
	}
}
