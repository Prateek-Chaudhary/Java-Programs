import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int num) {
		if(num>1)
			return num*factorial(num-1);
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		System.out.println(factorial(num));
	}
}
