import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int num,flag=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=scanner.nextInt();
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				flag=1;
		}
		if(flag==0)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}
}
