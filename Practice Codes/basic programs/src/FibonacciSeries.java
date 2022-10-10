import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0, b = 1, s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the Fibonacci Series : ");
		int num = sc.nextInt();
		System.out.print(a+" "+b+" ");
		for(int i = 1; i <= num-2; i++) {
			s = a + b;
			a = b;
			b = s;
			System.out.print(s+" ");
		}
	}
}