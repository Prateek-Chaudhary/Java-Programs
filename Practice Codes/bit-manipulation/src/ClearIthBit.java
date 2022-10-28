public class ClearIthBit {
	public static void main(String[] args) {
		int n = 309;
		int m = ~(1<<4);
		System.out.println(n & m);
	}
}
