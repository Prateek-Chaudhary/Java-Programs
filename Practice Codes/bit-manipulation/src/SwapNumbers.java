public class SwapNumbers {
	public static void main(String[] args) {
		int a = 13, b = 27;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a+" , "+b);
	}
}
