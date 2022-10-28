import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		if((n & 1) == 0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
	}
}
