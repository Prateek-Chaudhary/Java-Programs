import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		boolean flag = true;
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				flag = false;
				break;
			}
			else
				flag = true;
		}
		if(flag)
			System.out.println("Number "+num+" is prime.");
		else
			System.out.println("Number "+num+" is not prime.");
	}
}
