import java.util.Scanner;

public class GcdOfTwoNumber {

	public static int gcd(int n, int m) {
		int min = Math.min(n, m);
		while (min > 0) {
			if (n % min == 0 && m % min == 0)
				break;
			min--;
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the number 2 : ");
		int num2 = sc.nextInt();
		System.out.println(gcd(num1, num2));
	}
}
